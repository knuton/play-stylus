name := "play-stylus"

version := "0.1"

sbtPlugin := true

organization := "learnyousome"

description := "SBT plugin for handling stylus assets in Play"

resolvers += "Typesafe releases" at "http://repo.typesafe.com/typesafe/releases/"

//libraryDependencies += "play" %% "sbt-plugin" % "2.0"

libraryDependencies += "play" %% "play" % "2.0"

// Publishing

publishTo <<= (version) { version: String =>
  Some(Resolver.file("learnyousome-repo", file("../m2repo")))
}
