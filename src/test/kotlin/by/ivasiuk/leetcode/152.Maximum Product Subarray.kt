package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumProductSubarrayTest {
  private val solution = MaximumProductSubarray()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.maxProduct(
        nums = intArrayOf(2, 3, -2, 4)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.maxProduct(
        nums = intArrayOf(-2, 0, -1)
      )
    )
  }
}
