package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinCostClimbingStairsTest {
  private val solution = MinCostClimbingStairs()

  @Test
  fun example1() {
    assertEquals(
      expected = 15,
      actual = solution.minCostClimbingStairs(
        cost = intArrayOf(10, 15, 20)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 6,
      actual = solution.minCostClimbingStairs(
        cost = intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)
      )
    )
  }
}
