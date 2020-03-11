scalaVersion := "2.13.1"
resolvers += Resolver.mavenLocal
resolvers += Resolver.bintrayRepo("kamon-io", "snapshots")

libraryDependencies ++= Seq(
  "io.kamon" %% "kamon-core" % "2.0.0",
  "io.zipkin.reporter2" % "zipkin-reporter" % "2.7.14",
  "io.zipkin.reporter2" % "zipkin-sender-okhttp3" % "2.7.14",
  scalatest % "test"
)
