package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumSizeSubarraySumTest {
  private val solution = MinimumSizeSubarraySum()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.minSubArrayLen(
        target = 7,
        nums = intArrayOf(2, 3, 1, 2, 4, 3)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.minSubArrayLen(
        target = 4,
        nums = intArrayOf(1, 4, 4)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.minSubArrayLen(
        target = 11,
        nums = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1)
      )
    )
  }
}
