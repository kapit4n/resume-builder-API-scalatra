package com.resume.app

object ResumeData {

	var personalData = PersonalData("Luis Arce", "Software Architect")

	var all = List(
					Resume(PersonalData("Luis Arce", "Software Architect"), "Scala Developer", "Worked in some personal projects to enforce my skills",
							List("Scala", "Play Framework", "Scalatra","Linq"), List("English", "Spanish"), 
							List(Experience("2015", "2017", "Scala DEV", "Dyamsoft", List("Write Code"))), 
							List("Write a list of code by day", "Read a book by month"),
							List(Education("2005", "2010", "System Engineer", "UMSSS"))
						)
				)
}