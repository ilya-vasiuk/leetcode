package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertTrue

class ValidParenthesisStringTest {
  private val solution = ValidParenthesisString()

  @Test
  fun example1() {
    assertTrue {
      solution.checkValidString(
        s = "()"
      )
    }
  }

  @Test
  fun example2() {
    assertTrue {
      solution.checkValidString(
        s = "(*)"
      )
    }
  }

  @Test
  fun example3() {
    assertTrue {
      solution.checkValidString(
        s = "(*))"
      )
    }
  }
}
