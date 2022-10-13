package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class BestTimeToBuyAndSellStockTest {
  private val solution = BestTimeToBuyAndSellStock()

  @Test
  fun example1() {
    val result = solution.maxProfit(intArrayOf(7,1,5,3,6,4))
    assertEquals(5, result)
  }

  @Test
  fun example2() {
    val result = solution.maxProfit(intArrayOf(7,6,4,3,1))
    assertEquals(0, result)
  }
}