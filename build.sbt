name := "elastic-indexer"

version := "1.0"

scalaVersion := "2.10.2"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.3.4" % "test"
)