package nz.co.bottech.sbt.turtles

import sbt._

trait TurtlesKeys {

  val turtlesExampleSetting = settingKey[String]("A setting that is automatically imported to the build")
  val turtlesExampleTask = taskKey[String]("A task that is automatically imported to the build")
}

object TurtlesKeys extends TurtlesKeys
