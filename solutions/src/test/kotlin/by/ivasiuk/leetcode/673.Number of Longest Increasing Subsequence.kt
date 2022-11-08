package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfLongestIncreasingSubsequenceTest {
  private val solution = NumberOfLongestIncreasingSubsequence()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.findNumberOfLIS(
        nums = intArrayOf(1, 3, 5, 4, 7)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 5,
      actual = solution.findNumberOfLIS(
        nums = intArrayOf(2, 2, 2, 2, 2)
      )
    )
  }
}