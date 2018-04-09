import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.simple.spark",
      scalaVersion := "2.12.5",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "simple-spark",
    libraryDependencies += scalaTest % Test
    libraryDependencies += spark
  )
