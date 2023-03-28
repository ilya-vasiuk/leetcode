package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumCostForTicketsTest {
  private val solution = MinimumCostForTickets()

  @Test
  fun example1() {
    assertEquals(
      expected = 11,
      actual = solution.mincostTickets(
        days = intArrayOf(1, 4, 6, 7, 8, 20),
        costs = intArrayOf(2, 7, 15)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 17,
      actual = solution.mincostTickets(
        days = intArrayOf(1,2,3,4,5,6,7,8,9,10,30,31),
        costs = intArrayOf(2, 7, 15)
      )
    )
  }
}
