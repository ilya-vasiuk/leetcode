package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class BestTimeToBuyAndSellStockWithTransactionFeeTest {
  private val solution = BestTimeToBuyAndSellStockWithTransactionFee()

  @Test
  fun example1() {
    assertEquals(
      expected = 8,
      actual = solution.maxProfit(
        prices = intArrayOf(1, 3, 2, 8, 4, 9),
        fee = 2,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 6,
      actual = solution.maxProfit(
        prices = intArrayOf(1, 3, 7, 5, 10, 3),
        fee = 3,
      )
    )
  }
}
