package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumSubarrayTest {
  private val solution = MaximumSubarray()

  @Test
  fun example1() {
    val result = solution.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))
    assertEquals(6, result)
  }

  @Test
  fun example2() {
    val result = solution.maxSubArray(intArrayOf(1))
    assertEquals(1, result)
  }

  @Test
  fun example3() {
    val result = solution.maxSubArray(intArrayOf(5, 4, -1, 7, 8))
    assertEquals(23, result)
  }

  @Test
  fun onlyNegatives() {
    val result = solution.maxSubArray(intArrayOf(-1, -2, -3))
    assertEquals(-1, result)
  }
}