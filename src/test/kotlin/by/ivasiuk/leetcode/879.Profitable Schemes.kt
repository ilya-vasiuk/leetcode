package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ProfitableSchemesTest {
  private val solution = ProfitableSchemes()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.profitableSchemes(
        n = 5,
        minProfit = 3,
        group = intArrayOf(2, 2),
        profit = intArrayOf(2, 3),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 7,
      actual = solution.profitableSchemes(
        n = 10,
        minProfit = 5,
        group = intArrayOf(2, 3, 5),
        profit = intArrayOf(6, 7, 8),
      )
    )
  }
}
