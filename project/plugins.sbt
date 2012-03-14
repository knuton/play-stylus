logLevel := Level.Warn

//resolvers ++= Seq(
//    DefaultMavenRepository,
//    "Typesafe Repository" at "http://repo.typesafe.com/typesafe/ivy-releases/",
//"Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
//)

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("play" % "sbt-plugin" % "2.0")
