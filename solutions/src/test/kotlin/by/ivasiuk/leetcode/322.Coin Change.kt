package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CoinChangeTest {
  private val solution = CoinChange()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.coinChange(
        coins = intArrayOf(1, 2, 5),
        amount = 11
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = -1,
      actual = solution.coinChange(
        coins = intArrayOf(2),
        amount = 3
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.coinChange(
        coins = intArrayOf(1),
        amount = 0
      )
    )
  }
}