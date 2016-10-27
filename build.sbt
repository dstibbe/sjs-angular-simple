name := "client"

scalaVersion in ThisBuild := "2.11.7"

enablePlugins(ScalaJSPlugin)

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.0",
  "com.greencatsoft" %%% "scalajs-angular" % "0.7" // scala.js interface for angular
)


jsDependencies ++= Seq(
  "org.webjars" % "angularjs" % "1.5.8" / "angular.js" // angular JavaScript library
)


//Settings WorkBench for quick development

workbenchSettings

bootSnippet := "nl.quintor.dstibbe.helloworld.HelloApp().main();"

updateBrowsers <<= updateBrowsers.triggeredBy(fastOptJS in Compile)
