name := "play-stylus"

version := "0.1.3"

sbtPlugin := true

organization := "patience"

description := "sbt plugin for handling stylus assets in Play"

resolvers += Resolver.url("Typesafe Releases", url("http://repo.typesafe.com/typesafe/releases/"))(Resolver.mavenStylePatterns)

/// Dependencies

libraryDependencies ++= Seq(
  "play" %% "play" % "2.0",
  "play" % "sbt-plugin" % "2.0" from "http://repo.typesafe.com/typesafe/releases/play/sbt-plugin/scala_2.9.1/sbt_0.11.2/2.0/jars/sbt-plugin.jar",
  "org.scalatest" %% "scalatest" % "1.7.1" % "test"
)
