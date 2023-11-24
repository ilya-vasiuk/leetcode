package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumCostToCutAStickTest {
  private val solution = MinimumCostToCutAStick()

  @Test
  fun example1() {
    assertEquals(
      expected = 16,
      actual = solution.minCost(
        n = 7,
        cuts = intArrayOf(1, 3, 4, 5),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 22,
      actual = solution.minCost(
        n = 9,
        cuts = intArrayOf(5, 6, 1, 4, 2),
      )
    )
  }
}
