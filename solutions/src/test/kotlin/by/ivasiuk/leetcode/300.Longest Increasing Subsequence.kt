package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestIncreasingSubsequenceTest {
  private val solution = LongestIncreasingSubsequence()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.lengthOfLIS(
        nums = intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.lengthOfLIS(
        nums = intArrayOf(0, 1, 0, 3, 2, 3)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1,
      actual = solution.lengthOfLIS(
        nums = intArrayOf(7, 7, 7, 7, 7, 7, 7)
      )
    )
  }
}
