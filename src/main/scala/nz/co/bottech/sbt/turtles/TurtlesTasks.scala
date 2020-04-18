package nz.co.bottech.sbt.turtles

import nz.co.bottech.sbt.turtles.TurtlesKeys._
import sbt._

object TurtlesTasks {

  def exampleTask = Def.task {
    "computed from example setting: " + turtlesExampleSetting.value
  }
}
