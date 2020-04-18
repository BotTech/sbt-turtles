name := "sbt-turtles"
description := """An sbt plugin for sharing settings between the meta-builds and the main build."""
organization := "nz.co.bottech"
organizationName := "BotTech"
homepage := Some(url("https://github.com/BotTech/sbt-turtles"))
licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

scalaVersion := "2.12.11"

sbtPlugin := true

libraryDependencies += "com.lihaoyi" %% "utest" % "0.7.4" % Test
testFrameworks += new TestFramework("utest.runner.Framework")

enablePlugins(ScriptedPlugin)
scriptedLaunchOpts ++= Seq(
  "-Xmx1024M",
  "-Dplugin.version=" + version.value
)
scriptedBufferLog := false

bintrayOrganization := Some("bottech")
bintrayPackageLabels := Seq("sbt", "plugin")

ghreleaseRepoOrg := organizationName.value
