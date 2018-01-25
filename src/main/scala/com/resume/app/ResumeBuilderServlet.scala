package com.resume.app

import org.scalatra._

import org.scalatra.{ ScalatraServlet}
import org.scalatra.json._

import scala.collection.JavaConverters._
import org.json4s.{DefaultFormats, Formats}

class ResumeBuilderServlet extends ScalatraServlet  with JacksonJsonSupport with JValueResult {
  import org.json4s.JsonDSL._
  protected val applicationDescription = "The pets api"
  protected implicit val jsonFormats: Formats = DefaultFormats

  get("/") {
    "Hello World"
  }

}
