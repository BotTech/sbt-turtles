package nz.co.bottech.sbt.turtles

import nz.co.bottech.sbt.turtles.TurtlesKeys._
import nz.co.bottech.sbt.turtles.TurtlesTasks._
import sbt._

object TurtlesSettings {

  val rawSettings = Seq(
    turtlesExampleSetting := exampleSetting.value,
    turtlesExampleTask := exampleTask.value
  )

  def exampleSetting = Def.setting {
    "just an example"
  }
}
