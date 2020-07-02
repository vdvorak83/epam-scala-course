package com.epam.play_with_scala

/**
 * @author Evgeny Borisov
 */
object AnimalFactory {

  def apply(): Animal = new Dog


  def main(args: Array[String]): Unit = {


    val List(a, v, d) = List(1, 2, 4)

    println(a)
    println(v)
    println(d)

  }

}
