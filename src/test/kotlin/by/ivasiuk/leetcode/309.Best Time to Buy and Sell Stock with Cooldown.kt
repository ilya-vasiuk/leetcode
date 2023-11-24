package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class BestTimeToBuyAndSellStockWithCooldownTest {
  private val solution = BestTimeToBuyAndSellStockWithCooldown()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.maxProfit(
        prices = intArrayOf(1, 2, 3, 0, 2)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.maxProfit(
        prices = intArrayOf(1)
      )
    )
  }
}
