val ScalatraVersion = "2.6.2"

organization := "resume"

name := "Resume Builder"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.4"

resolvers += Classpaths.typesafeReleases

resolvers += "Akka Repo" at "http://repo.akka.io/repository"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.4.8.v20171121" % "container",
  "org.scalatra" %% "scalatra-json" % "2.5.4",
  "org.json4s" %% "json4s-jackson" % "3.6.0-M2",
  "net.liftweb" %% "lift-json" % "3.2.0-RC1",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "com.typesafe.slick" %% "slick" % "3.2.0",
  "com.h2database" % "h2" % "1.4.196"
)

libraryDependencies += "com.mchange" % "c3p0" % "0.9.5.2"

enablePlugins(SbtTwirl)
enablePlugins(ScalatraPlugin)
