/// Project

name := "play-stylus"

sbtPlugin := true

version := "0.1.3"

organization := "patience"

description := "sbt plugin for handling stylus assets in Play"

/// Repositories

resolvers += new MavenRepository("typesafe-releases", "http://repo.typesafe.com/typesafe/releases/")

publishTo := Some(Resolver.sftp("Patience", "repo.patience.io", "repo"))

/// Dependencies

libraryDependencies ++= Seq(
  "play" %% "play" % "2.0",
  "play" % "sbt-plugin" % "2.0" from "http://repo.typesafe.com/typesafe/releases/play/sbt-plugin/scala_2.9.1/sbt_0.11.2/2.0/jars/sbt-plugin.jar",
  "org.scalatest" %% "scalatest" % "1.7.1" % "test"
)
