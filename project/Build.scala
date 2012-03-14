import sbt._
import sbt.Keys._

object PluginBuild extends Build {

  lazy val playStylus = Project(
    id = "play-stylus", base = file(".")
  ).settings(
    sbtPlugin := true,
    name := "play-stylus",
    libraryDependencies += "play" %% "play" % "2.0"
  )

}
