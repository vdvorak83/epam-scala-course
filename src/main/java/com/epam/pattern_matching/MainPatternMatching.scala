package com.epam.pattern_matching

/**
 * @author Evgeny Borisov
 */
object MainPatternMatching {
  def main(args: Array[String]): Unit = {
    val login = Login(userName = "jeka", pass = "j1234", "j1234")
    val str = LoginValidator.validate(login, 10)
    println(str.toUpperCase)
    val eng = new English("eng")

    println(eng.name)

  }


  class Language(val name: String) {}

  class English(name: String) extends Language(name)


}
