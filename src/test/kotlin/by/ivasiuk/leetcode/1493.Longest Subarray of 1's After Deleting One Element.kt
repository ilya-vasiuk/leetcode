package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestSubarrayOf1sAfterDeletingOneElementTest {
  private val solution = LongestSubarrayOf1sAfterDeletingOneElement()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.longestSubarray(
        nums = intArrayOf(1, 1, 0, 1)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 5,
      actual = solution.longestSubarray(
        nums = intArrayOf(0, 1, 1, 1, 0, 1, 1, 0, 1)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 2,
      actual = solution.longestSubarray(
        nums = intArrayOf(1, 1, 1)
      )
    )
  }
}
