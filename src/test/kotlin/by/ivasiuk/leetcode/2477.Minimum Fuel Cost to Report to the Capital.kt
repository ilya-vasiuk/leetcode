package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumFuelCostToReportToTheCapitalTest {
  private val solution = MinimumFuelCostToReportToTheCapital()

  @Test
  fun example1() {
    assertEquals(
      expected = 7,
      actual = solution.minimumFuelCost(
        roads = arrayOf(
          intArrayOf(3, 1),
          intArrayOf(3, 2),
          intArrayOf(1, 0),
          intArrayOf(0, 4),
          intArrayOf(0, 5),
          intArrayOf(4, 6),
        ),
        seats = 2,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.minimumFuelCost(
        roads = emptyArray(),
        seats = 1,
      )
    )
  }
}