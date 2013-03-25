name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
  "org.scala-saddle" %% "saddle" % "1.0.0-SNAPSHOT",
  "org.specs2" %% "specs2" % "1.13" % "test"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
