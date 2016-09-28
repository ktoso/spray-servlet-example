name := "exampleAPI"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= {
  val akkaVersion = "2.3.9"
  val sprayVersion = "1.3.3"
  Seq(
    "io.spray"            %%  "spray-can"       % sprayVersion,
    "io.spray"            %%  "spray-servlet"   % sprayVersion, // We need spray-servlet
    "io.spray"            %%  "spray-routing"   % sprayVersion,
    "io.spray"            %%  "spray-json"      % "1.3.1",
    "io.spray"            %%  "spray-testkit"   % sprayVersion  % "test",
    "org.scalatest"       %%  "scalatest"       % "2.2.4"       % "test",
    "com.typesafe.akka"   %%  "akka-actor"      % akkaVersion,
    "com.typesafe.akka"   %%  "akka-testkit"    % akkaVersion   % "test",
    "com.typesafe.akka"   %%  "akka-slf4j"      % akkaVersion,
    "ch.qos.logback"      %  "logback-classic"  % "1.1.2"
  )
}

////This adds tomcat dependencies, you can also use jetty()
//tomcat() 

com.earldouglas.xwp.WebappPlugin.projectSettings

webappWebInfClasses := true

enablePlugins(TomcatPlugin)
