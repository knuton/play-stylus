name := "play-stylus"

version := "0.1"

sbtPlugin := true

organization := "learnyousome"

description := "SBT plugin for handling stylus assets in Play"

/// Dependencies

libraryDependencies ++= Seq(
  "play" %% "play" % "2.0",
  "play" % "sbt-plugin" % "2.0" from "http://repo.typesafe.com/typesafe/releases/play/sbt-plugin/scala_2.9.1/sbt_0.11.2/2.0/jars/sbt-plugin.jar",
  "org.scalatest" %% "scalatest" % "1.7.1" % "test"
)

/// Publishing

publishTo <<= (version) { version: String =>
  Some(Resolver.file("learnyousome-repo", file("../m2repo")))
}
