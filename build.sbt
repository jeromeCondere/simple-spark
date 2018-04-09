import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.simple.spark",
      scalaVersion := "2.11.8",
      version      := "0.0.1-SNAPSHOT"
    )),
    name := "simple-spark",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += spark
  )
