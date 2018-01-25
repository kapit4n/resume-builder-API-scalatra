val ScalatraVersion = "2.6.2"

organization := "resume"

name := "Resume Builder"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.4"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.4.8.v20171121" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",

  "org.scalatra"                 %% "scalatra-specs2"        % ScalatraVersion     % "test",
  "org.scalatra" %% "scalatra-json" % "2.5.4",
  "org.json4s"   %% "json4s-jackson" % "3.2.11",
  "org.eclipse.jetty.orbit"      % "javax.servlet"          % "3.0.0.v201112011016" % "container;provided;test" artifacts (Artifact("javax.servlet", "jar", "jar"))
)

enablePlugins(SbtTwirl)
enablePlugins(ScalatraPlugin)
