package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class TotalCostToHireKWorkersTest {
  private val solution = TotalCostToHireKWorkers()

  @Test
  fun example1() {
    assertEquals(
      expected = 11,
      actual = solution.totalCost(
        costs = intArrayOf(17, 12, 10, 2, 7, 2, 11, 20, 8),
        k = 3,
        candidates = 4
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.totalCost(
        costs = intArrayOf(1, 2, 4, 1),
        k = 3,
        candidates = 3
      )
    )
  }
}
