package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumCostToMakeArrayEqualTest {
  private val solution = MinimumCostToMakeArrayEqual()

  @Test
  fun example1() {
    assertEquals(
      expected = 8,
      actual = solution.minCost(
        nums = intArrayOf(1, 3, 5, 2),
        cost = intArrayOf(2, 3, 1, 14)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.minCost(
        nums = intArrayOf(2, 2, 2, 2, 2),
        cost = intArrayOf(4, 2, 8, 1, 3)
      )
    )
  }
}
