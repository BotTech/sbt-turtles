package nz.co.bottech.sbt.turtles

import nz.co.bottech.sbt.turtles.TurtlesSettings._
import sbt._
import sbt.plugins.JvmPlugin

object TurtlesPlugin extends AutoPlugin {

  override def trigger = allRequirements
  override def requires = JvmPlugin

  object autoImport extends TurtlesKeys

  override lazy val projectSettings: Seq[Def.Setting[_]] = {
    inConfig(Compile)(rawSettings)
  }
}
