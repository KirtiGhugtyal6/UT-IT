package com.question1

class PasswordValidations(password: String) {

  def passwordIsValid: Boolean = {
    if (password.contains(" "))
      return false
    if (true)
    {
      var count: Int = 0
      for (digit <- 0 until 9)
      {
        var digitString = digit.toString
        if (password.contains(digitString))
          count = 1
      }
      if (count == 0)
        return false
    }
    if (!(password.length >= 8 && password.length <= 15))
      return false
    if (true) {
      var count: Int = 0
      for (letter <- 90 until 122) {
        var character = letter.asInstanceOf[Char]
        var str = character.toString
        if (password.contains(str))
          count = 1
      }
      if (count == 0)
        return false
    }
    if (true) {
      var count: Int = 0
      for (letter <- 65 until 97) {
        var character = letter.asInstanceOf[Char]
        var str = character.toString
        if (password.contains(str))
          count = 1
      }

      if (count == 0)
        return false
    }
    if (!(password.contains("@") || password.contains("#")
      || password.contains("!") || password.contains("~")
      || password.contains("$") || password.contains("%")
      || password.contains("^") || password.contains("&")
      || password.contains("*") || password.contains("(")
      || password.contains(")") || password.contains("-")
      || password.contains("+") || password.contains("/")
      || password.contains(":") || password.contains(".")
      || password.contains(", ") || password.contains("<")
      || password.contains(">") || password.contains("?")
      || password.contains("|"))) {
      return false;
    }
    true
  }
}