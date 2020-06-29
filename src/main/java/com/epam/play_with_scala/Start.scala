package com.epam.play_with_scala

import java.util.Random

/**
 * @author Evgeny Borisov
 */
object Start {


  def printName(): Unit = println("name")

  def main(args: Array[String]): Unit = {


    
    var x:Double = 19
    x=2.3
    var s = ""
    s.exists(_.isDigit)

    println("Hello scala")
    println(Math.sqrt(2))
    val random = new Random()
    val i = random.nextInt(100)
    println(i)
  }

}
