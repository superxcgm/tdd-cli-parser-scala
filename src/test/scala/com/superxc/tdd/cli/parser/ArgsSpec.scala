package com.superxc.tdd.cli.parser

import org.scalatest.flatspec.AnyFlatSpec

class ArgsSpec extends AnyFlatSpec{
  "A Args" should "parse bool as true if option present" in {
    val args = Args.parse("l:b", "-l")

    assert(true === args.getBool("l"))
  }

  "A Args" should "parse bool as false if option not present" in {
    val args = Args.parse("l:b", "")

    assert(false === args.getBool("l"))
  }

  "A Args" should "parse int option correctly" in {
    val args = Args.parse("p:d", "-p", "8080")

    assert(8080 === args.getInt("p"))
  }

  "A Args" should "parse string option correctly" in {
    val args = Args.parse("d:s", "-d", "/usr/logs")

    assert("/usr/logs" === args.getString("d"))
  }

  "A Args" should "parse multi args" in {
    val args = Args.parse("l:b,p:d,d:s", "-l", "-p", "8080", "-d", "/usr/logs")

    assert(true === args.getBool("l"))
    assert(8080 === args.getInt("p"))
    assert("/usr/logs" === args.getString("d"))
  }

  // TODO: sad path
  // TODO:   1. bool with value
  // TODO:   2. int more than 1 value
  // TODO:   3. String more than 1 value

  // TODO: parse default value
  // TODO: parse bool -l not present => false
  // TODO: parse int value not present => 0
  // TODO: parse String value not present => ""


}
