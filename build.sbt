/// Project

name := "play-stylus"

sbtPlugin := true

version := "0.1.3"

// 2.9.2 has internal bug (AssertError in traits), that prevents project from building.
// 2.10.0 has no sbt-plugin. So, let's use 2.9.3
scalaVersion := "2.9.3"

organization := "patience"

description := "sbt plugin for handling stylus assets in Play"

/// Repositories

resolvers += new MavenRepository("typesafe-releases", "http://repo.typesafe.com/typesafe/releases/")

publishTo := Some(Resolver.sftp("Patience", "repo.patience.io", "repo"))

/// Dependencies

libraryDependencies ++= Seq(
  "play" %% "play" % "2.1.1",
  "play" % "sbt-plugin" % "2.1.1" from "http://repo.typesafe.com/typesafe/releases/play/sbt-plugin/scala_2.9.3/sbt_0.12/2.1.1/jars/sbt-plugin.jar",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test",
  // ... class file needed by PlayAssetsCompiler is missing. reference value javascript of package com.google refers to nonexisting symbol...
  "com.google.javascript" % "closure-compiler" % "r1043"
)
