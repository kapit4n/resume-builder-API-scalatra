package com.resume.app.models

case class Resume(id: Long, 
  personalData: PersonalData,
  title: String, 
  summary: String, 
  skills: List[String] = List(),
  languages: List[String], 
  experience: List[Experience], 
  hobbies: List[String],
  education: List[Education]
)
