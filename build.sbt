name := "swagger-akka-http-sample"

scalaVersion := "2.12.1"

resolvers += Resolver.sonatypeRepo("public")
resolvers += Resolver.sonatypeRepo("snapshots")
resolvers += DefaultMavenRepository
resolvers += "jitpack" at "https://jitpack.io"

val akkaHttpVersion = "10.0.0"

libraryDependencies ++= Seq(
  "com.github.swagger-akka-http" %% "swagger-akka-http" % "0.8.2-SNAPSHOT",
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "ch.megard" %% "akka-http-cors" % "0.1.10",
  "org.slf4j" % "slf4j-simple" % "1.7.14"
)
