package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinCostToConnectAllPointsTest {
  private val solution = MinCostToConnectAllPoints()

  @Test
  fun example1() {
    assertEquals(
      expected = 20,
      actual = solution.minCostConnectPoints(
        points = arrayOf(
          intArrayOf(0, 0),
          intArrayOf(2, 2),
          intArrayOf(3, 10),
          intArrayOf(5, 2),
          intArrayOf(7, 0),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 18,
      actual = solution.minCostConnectPoints(
        points = arrayOf(
          intArrayOf(3, 12),
          intArrayOf(-2, 5),
          intArrayOf(-4, 1),
        )
      )
    )
  }
}
