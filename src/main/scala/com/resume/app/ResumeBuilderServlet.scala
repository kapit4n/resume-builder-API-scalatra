package com.resume.app

import org.scalatra._
import com.resume.app.models._
import com.resume.app.repositories._

import org.scalatra.{ ScalatraServlet, FutureSupport }
import org.scalatra.json._

import scala.collection.JavaConverters._
import org.json4s.{ DefaultFormats, Formats }

import net.liftweb.json._


import slick.jdbc.H2Profile.api._

import scala.concurrent.ExecutionContext.Implicits.global

class ResumeBuilderServlet(val db: Database)  extends ScalatraServlet with JacksonJsonSupport with FutureSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats
  protected implicit def executor = scala.concurrent.ExecutionContext.Implicits.global

  // def db: Database

  before() {
    contentType = formats("json")
  }

  get("/db/create-tables") {
    db.run(Tables.createSchemaAction)
  }

  get("/db/load-data") {
    db.run(Tables.insertSupplierAndCoffeeData)
  }

  get("/db/drop-tables") {
    db.run(Tables.dropSchemaAction)
  }

  get("/coffees") {
    // run the action and map the result to something more readable
    db.run(Tables.findCoffeesWithSuppliers.result)
  }

  get("/resumes") {
    ResumeRepository.resumes
  }

  post("/resumes") {
    val resumeStr = parse(request.body)
    val resumeObj = resumeStr.extract[Resume]
    resumeObj
  }

  get("/resumes/:id") {
    ResumeRepository.getResumeById(params.getAs[Long]("id").getOrElse(0))
  }

  put("/resumes/:id") {
    val resumeStr = parse(request.body)
    val resumeObj = resumeStr.extract[Resume]
    resumeObj
  }

}
