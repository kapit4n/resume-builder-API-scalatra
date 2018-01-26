package com.resume.app.repositories

import com.resume.app.models._

object ResumeRepository {

	var personalData = PersonalData("Luis Arce", "Software Architect")

	var resumes = List(
					Resume(1L, PersonalData("Luis Arce", "Software Architect"), "Scala Developer", "Worked in some personal projects to enforce my skills",
							List("Scala", "Play Framework", "Scalatra","Linq"), List("English", "Spanish"), 
							List(Experience("2015", "2017", "Scala DEV", "Dyamsoft", List("Write Code"))), 
							List("Write a list of code by day", "Read a book by month"),
							List(Education("2005", "2010", "System Engineer", "UMSSS"))
						)
				)

	def getResumeById(id: Long): Option[Resume] = {
    resumes.filter(resume => resume.id == id) match {
      case resumes: List[Resume] if resumes.size > 0 => Some(resumes.head)
      case _ => None
    }
  }
}