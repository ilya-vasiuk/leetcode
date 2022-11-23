package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PalindromeNumberTest {
  private val solution = PalindromeNumber()

  @Test
  fun example1() {
    assertTrue {
      solution.isPalindrome(
        x = 121
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.isPalindrome(
        x = -121
      )
    }
  }

  @Test
  fun example3() {
    assertFalse {
      solution.isPalindrome(
        x = 10
      )
    }
  }
}