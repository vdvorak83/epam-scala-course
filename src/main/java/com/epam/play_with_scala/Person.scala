package com.epam.play_with_scala

/**
 * @author Evgeny Borisov
 */
class Person(var name:String="John") {

  println(123)

  def abc(x:Int=12): Unit =println(123)

  def init() = {
    this.name=this.name.toUpperCase()
    println("person was create with name: "+this.name)
  }

  init()





  override def toString: String = {
    return "sajdalsjhgldsj"
  }

  println("987")
}
