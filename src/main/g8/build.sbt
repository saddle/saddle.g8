name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.4"

resolvers ++= Seq(
    "Sonatype OSS Releases" at "http://oss.sonatype.org/content/repositories/releases/",
    "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.1",
  "org.joda" % "joda-convert" % "1.2",
  "org.scala-saddle" %% "saddle-core" % "1.3.+",
  "org.specs2" %% "specs2" % "2.4.1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.3" % "test",
  "junit" % "junit" % "4.11" % "test"
)

initialCommands := """
import org.joda.time.DateTime
import org.saddle._
import org.saddle.time._
import org.saddle.io._
"""


