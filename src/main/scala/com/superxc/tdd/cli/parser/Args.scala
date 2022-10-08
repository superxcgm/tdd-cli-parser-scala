package com.superxc.tdd.cli.parser

object Args {
  def parse(pattern: String, args: String*): Arguments = {
    Arguments(
      pattern.split(",")
        .map(_.split(":"))
        .map(option => {
          val name = option(0)
          val t = option(1)

          val value = if (t == "b") {
            args.contains(s"-$name")
          } else if (t == "d") {
            args(args.indexOf(s"-$name") + 1).toInt
          } else if (t == "s") {
            args(args.indexOf(s"-$name") + 1)
          }
          (name, value)
        }).toMap
    )
  }

}
