package com.resume.app

case class PersonalData(fullName: String, profession: String)

case class Experience(fromDate: String, toDate: String, title: String, company: String, actions: List[String])

case class Education(fromDate: String, toDate: String, subject: String, collage: String)

case class Resume(personalData: PersonalData, title: String, summary: String, skills: List[String],
					languages: List[String], experience: List[Experience], hobbies: List[String],
					education: List[Education]
				  )
