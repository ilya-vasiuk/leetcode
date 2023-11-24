package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CheckIfTwoStringArraysAreEquivalentTest {
  private val solution = CheckIfTwoStringArraysAreEquivalent()

  @Test
  fun example1() {
    assertTrue {
      solution.arrayStringsAreEqual(arrayOf("ab", "c"), arrayOf("a", "bc"))
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.arrayStringsAreEqual(arrayOf("a", "cb"), arrayOf("ab", "c"))
    }
  }

  @Test
  fun example3() {
    assertTrue {
      solution.arrayStringsAreEqual(arrayOf("abc", "d", "defg"), arrayOf("abcddefg"))
    }
  }
}