package com.epam.play_with_scala

/**
 * @author Evgeny Borisov
 */
class Dog extends Animal {
  var age=0
  override def makeSound(): Unit = println("gav gav")
}

object Dog {
  def apply(): Dog ={
    println("dog is created")
    val dog = new Dog()
    dog.age=7
    dog
  }

}
