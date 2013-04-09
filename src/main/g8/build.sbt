name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.9.2"

resolvers ++= Seq(
    "Sonatype OSS Releases" at "http://oss.sonatype.org/content/repositories/releases/",
    "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.1",
  "org.joda" % "joda-convert" % "1.2",
  "org.scala-saddle" %% "saddle" % "1.0.+",
  "org.specs2" %% "specs2" % "1.12.3" % "test",
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test",
  "junit" % "junit" % "4.7" % "test"
)

initialCommands := """
import org.joda.time.DateTime
import org.saddle._
import org.saddle.time._
import org.saddle.io._
import $organization$.$name;format="lower,word"$._"""

