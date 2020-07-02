package com.epam.play_with_scala

/**
 * @author Evgeny Borisov
 */
case class Cat(var age:Int,var string: String="") extends Animal {
  override def makeSound(): Unit = println("mau mau")




}

object Cat {
  def apply(name: String): Cat = new Cat(name.length)

  def unapply(arg: Cat): Option[(Int, String)] = {
    ???
  }

}
