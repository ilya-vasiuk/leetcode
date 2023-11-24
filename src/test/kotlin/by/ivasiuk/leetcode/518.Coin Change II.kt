package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CoinChange2Test {
  private val solution = CoinChange2()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.change(
        amount = 5,
        coins = intArrayOf(1, 2, 5)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.change(
        amount = 3,
        coins = intArrayOf(2)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1,
      actual = solution.change(
        amount = 10,
        coins = intArrayOf(10)
      )
    )
  }
}
