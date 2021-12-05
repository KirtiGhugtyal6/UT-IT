package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorUnitTest extends AnyFlatSpec {
  val emailValidator = new EmailValidator
  "email" should "be valid" in {
    val result: Boolean = emailValidator.emailIdIsValid("kirti@knoldus.com")
    assert(result)
  }

  "email" should "be invalid if @ is not present there" in {
    val result: Boolean = emailValidator.emailIdIsValid("kirtiknoldus.com")
    assert(!result)
  }

  "email" should "be invalid if it is Starting with Special Character'" in {
    val result: Boolean = emailValidator.emailIdIsValid("%knoldusinterns.com")
    assert(!result)
  }

  "email" should "be invalid if there is any space between it" in {
    val result: Boolean = emailValidator.emailIdIsValid("kirti @knoldus.com")
    assert(!result)
  }

  "email" should "be invalid if it is not as per the rule'" in {
    val result: Boolean = emailValidator.emailIdIsValid("abc@knoldus.kirti")
    assert(!result)
  }

}