package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumSubsequenceScoreTest {
  private val solution = MaximumSubsequenceScore()

  @Test
  fun example1() {
    assertEquals(
      expected = 12,
      actual = solution.maxScore(
        nums1 = intArrayOf(1, 3, 3, 2),
        nums2 = intArrayOf(2, 1, 3, 4),
        k = 3
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 30,
      actual = solution.maxScore(
        nums1 = intArrayOf(4, 2, 3, 1, 1),
        nums2 = intArrayOf(7, 5, 10, 9, 6),
        k = 1
      )
    )
  }
}
