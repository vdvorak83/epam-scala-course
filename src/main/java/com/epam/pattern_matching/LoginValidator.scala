package com.epam.pattern_matching

/**
 * @author Evgeny Borisov
 */
object LoginValidator {


  def validate(login: Any): String = {


    val result: String = login match {
      case Login("admin", _, _) => "user can't be admin "
      case Login(_, pass, _) if pass.contains("z") => s"pass can't contain z and it: $pass"
      case Login(user, pass, _) if user == pass => s"user and pass are the same: $user"
      case Login(_, pass, _) if pass.forall(_.isDigit) => "pass con't be only digits"
      case Login(_, pass, conf) if pass != conf => s"pass $pass is not equals to confitrmation: $conf"
      case _ => s"login is ok"
    }

    result
  }
}
