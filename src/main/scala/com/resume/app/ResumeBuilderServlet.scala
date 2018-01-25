package com.resume.app

import org.scalatra._

class ResumeBuilderServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
