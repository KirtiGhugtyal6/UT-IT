package com.question1

import org.scalatest.flatspec.AnyFlatSpec

class PasswordValidationsTest extends AnyFlatSpec {
  "password" should "be invalid as it contains space" in {
    val password = new PasswordValidations("Kirti@ 1234")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any digit" in {
    val password = new PasswordValidations("Kirti#Ghugtyal")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as the length is less than 8" in {
    val password = new PasswordValidations("kirti06@")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as the length is more than 15" in {
    val password = new PasswordValidations("KirtiGhugtyal@1999")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any lowercase letter" in {
    val password = new PasswordValidations("KIRTIGHUGTYAL@06")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any uppercase letter" in {
    val password = new PasswordValidations("kirtighugtyal@06")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any special character" in {
    val password = new PasswordValidations("KirtiGhugtyal6")
    assert(!password.passwordIsValid)
  }

  "password" should "be valid as it has all the necessary features" in {
    val password = new PasswordValidations("kirti@Ghugtyal6")
    assert(password.passwordIsValid)
  }
}