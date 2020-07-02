package com.epam.play_with_scala

import java.util

/**
 * @author Evgeny Borisov
 */
object Start {


  def printName(string: String, x: Int = 2): Unit = println("name")

  def main(args: Array[String]): Unit = {
    var scalalist: List[String] = Nil
    scalalist = "java" :: "scala" :: scalalist
    println(scalalist)
//    scalalist.filter(_.contains('d'))

    val strings = new util.ArrayList[String]()
    strings.add("asdsd")
    println(strings)
  }


}
