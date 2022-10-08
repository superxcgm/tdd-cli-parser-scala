package com.superxc.tdd.cli.parser

import org.scalatest.flatspec.AnyFlatSpec

class ArgsSpec extends AnyFlatSpec{
// TODO: parse bool -l
// TODO: parse int -p 8080
// TODO: parse String -d /usr/logs
// TODO: parse multi value -l -p 8080 -d /usr/logs
// TODO: parse default value
// TODO: parse bool -l not present => false
// TODO: parse int value not present => 0
// TODO: parse String value not present => ""
// TODO: sad path
// TODO:   1. bool with value
// TODO:   2. int more than 1 value
// TODO:   3. String more than 1 value

//  "A Args"
  ignore should "parse multi args" in {
    val args = Args.parse("l:b,p:d,d:s", "-l", "-p", "8080", "-d", "/usr/logs")

    assert(true === args.getBool("l"))
    assert(8080 === args.getInt("p"))
    assert("/usr/logs" === args.getString("d"))
  }
}
