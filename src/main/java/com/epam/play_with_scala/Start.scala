package com.epam.play_with_scala

/**
 * @author Evgeny Borisov
 */
object Start {


  def printName(string: String, x: Int=2): Unit = println("name")

  def main(args: Array[String]): Unit = {
    val person = new Person(name = "vasya")
    println(person.name)
    person.abc()
  }

}
