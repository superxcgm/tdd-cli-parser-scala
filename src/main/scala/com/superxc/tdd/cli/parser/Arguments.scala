package com.superxc.tdd.cli.parser

case class Arguments(values: Map[String, Any]) {

  def getString(name: String): String = values(name).asInstanceOf[String]

  def getInt(name: String): Int = values(name).asInstanceOf[Int]

  def getBool(name: String): Boolean = values(name).asInstanceOf[Boolean]

}
