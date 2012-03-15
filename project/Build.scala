import sbt._
import sbt.Keys._

object PluginBuild extends Build {

  lazy val playStylus = Project(
    id = "play-stylus", base = file(".")
  )

}
