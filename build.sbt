/// Project

name := "play-stylus"

sbtPlugin := true

version := "0.2.0"

// Incompatible with 2.9.2.
// 2.9.3, 2.10.x, etc are possible scalaVersions.
scalaVersion := "2.10.0"

organization := "patience"

description := "sbt plugin for handling stylus assets in Play"

/// Repositories

resolvers += new MavenRepository("typesafe-releases", "http://repo.typesafe.com/typesafe/releases/")

publishTo := Some(Resolver.sftp("Patience", "repo.patience.io", "repo"))

/// Dependencies

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play" % "2.2.0",
  "com.typesafe.play" %% "sbt-plugin" % "2.2.0" from "http://repo.typesafe.com/typesafe/ivy-releases/com.typesafe.play/sbt-plugin/scala_2.10/sbt_0.13/2.2.0/jars/sbt-plugin.jar",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test",
  // ... class file needed by PlayAssetsCompiler is missing. reference value javascript of package com.google refers to nonexisting symbol...
  "com.google.javascript" % "closure-compiler" % "r1043"
)
