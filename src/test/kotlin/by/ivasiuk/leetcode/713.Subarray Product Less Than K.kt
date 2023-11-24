package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SubarrayProductLessThanKTest {
  private val solution = SubarrayProductLessThanK()

  @Test
  fun example1() {
    assertEquals(
      expected = 8,
      solution.numSubarrayProductLessThanK(
        nums = intArrayOf(10, 5, 2, 6),
        k = 100
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      solution.numSubarrayProductLessThanK(
        nums = intArrayOf(1, 2, 3),
        k = 0
      )
    )
  }
}