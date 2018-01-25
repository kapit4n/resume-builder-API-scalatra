package com.resume.app

import org.scalatra.test.scalatest._

class ResumeBuilderServletTests extends ScalatraFunSuite {

  addServlet(classOf[ResumeBuilderServlet], "/*")

  test("GET / on ResumeBuilderServlet should return status 200"){
    get("/"){
      status should equal (200)
    }
  }

}
