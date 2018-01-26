package com.resume.app

import org.scalatra._
import com.resume.app.models._
import com.resume.app.repositories._

import org.scalatra.{ ScalatraServlet }
import org.scalatra.json._

import scala.collection.JavaConverters._
import org.json4s.{DefaultFormats, Formats}

import net.liftweb.json._


class ResumeBuilderServlet extends ScalatraServlet  with JacksonJsonSupport with JValueResult {
  import org.json4s.JsonDSL._
  protected implicit val jsonFormats: Formats = DefaultFormats

  before() {
    contentType = formats("json")
  }

  get("/resumes") {
    ResumeRepository.all
  }

  post("/resumes") {
  	val jsonString = request.body
  	//implicit val formats = DefaultFormats
  	val jValue = parse(jsonString)
  	val resume = jValue.extract[Resume]
  	resume
  }

}
