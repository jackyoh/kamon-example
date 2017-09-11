name := "kamon-example"

version := "1.0"

scalaVersion := "2.12.0"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4"
libraryDependencies += "io.kamon" %% "kamon-core" % "0.6.7"
libraryDependencies += "io.kamon" %% "kamon-statsd" % "0.6.7"
libraryDependencies += "io.kamon" %% "kamon-datadog" % "0.6.7"
