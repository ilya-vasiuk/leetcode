package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class BuyTwoChocolatesTest {
  private val solution = BuyTwoChocolates()

  @Test
  fun example1() {
    assertEquals(
      expected = 0,
      actual = solution.buyChoco(
        prices = intArrayOf(1, 2, 2),
        money = 3
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.buyChoco(
        prices = intArrayOf(3, 2, 3),
        money = 3
      )
    )
  }
}
