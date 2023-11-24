package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestArithmeticSubsequenceOfGivenDifferenceTest {
  private val solution = LongestArithmeticSubsequenceOfGivenDifference()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.longestSubsequence(
        arr = intArrayOf(1, 2, 3, 4),
        difference = 1,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.longestSubsequence(
        arr = intArrayOf(1, 3, 5, 7),
        difference = 1,
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 4,
      actual = solution.longestSubsequence(
        arr = intArrayOf(1, 5, 7, 8, 5, 3, 4, 2, 1),
        difference = -2,
      )
    )
  }
}
