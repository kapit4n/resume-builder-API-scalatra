package com.resume.app

import org.scalatra._
import com.resume.app.models._
import com.resume.app.repositories._

import org.scalatra.{ ScalatraServlet }
import org.scalatra.json._

import scala.collection.JavaConverters._
import org.json4s.{ DefaultFormats, Formats }

import net.liftweb.json._

class ResumeBuilderServlet extends ScalatraServlet with JacksonJsonSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  before() {
    contentType = formats("json")
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
