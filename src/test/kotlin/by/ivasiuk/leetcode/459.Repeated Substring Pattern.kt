package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RepeatedSubstringPatternTest {
  private val solution = RepeatedSubstringPattern()

  @Test
  fun example1() {
    assertTrue {
      solution.repeatedSubstringPattern(
        s = "abab"
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.repeatedSubstringPattern(
        s = "aba"
      )
    }
  }

  @Test
  fun example3() {
    assertTrue {
      solution.repeatedSubstringPattern(
        s = "abcabcabcabc"
      )
    }
  }
}
