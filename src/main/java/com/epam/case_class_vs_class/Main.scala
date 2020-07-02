package com.epam.case_class_vs_class

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {
    val p1 = Point(1, 2)
    val p2 = Point(1, 2)

    println(p1 == p2)
    println(p1.copy(x = 12,y = 10))
  }
}
