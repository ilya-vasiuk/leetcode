package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidParenthesesTest {
  private val solution = ValidParentheses()

  @Test
  fun example1() {
    assertTrue {
      solution.isValid("()")
    }
  }

  @Test
  fun example2() {
    assertTrue {
      solution.isValid("()[]{}")
    }
  }

  @Test
  fun example3() {
    assertFalse {
      solution.isValid("(]")
    }
  }
}