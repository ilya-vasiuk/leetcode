package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumSumCircularSubarrayTest {
  private val solution = MaximumSumCircularSubarray()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.maxSubarraySumCircular(
        nums = intArrayOf(1, -2, 3, -2)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 10,
      actual = solution.maxSubarraySumCircular(
        nums = intArrayOf(5, -3, 5)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = -2,
      actual = solution.maxSubarraySumCircular(
        nums = intArrayOf(-3, -2, -3)
      )
    )
  }
}
