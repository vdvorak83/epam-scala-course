package com.epam.traits

/**
 * @author Evgeny Borisov
 */
case class Hitman(x: Int) extends Killer {


  override def resurrect: Nothing = throw new UnsupportedOperationException

  override lazy val id: Int = {

    x * 10
  }
}
