package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumIceCreamBarsTest {
  private val solution = MaximumIceCreamBars()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.maxIceCream(
        costs = intArrayOf(1, 3, 2, 4, 1),
        coins = 7,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.maxIceCream(
        costs = intArrayOf(10, 6, 8, 7, 7, 8),
        coins = 5,
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 6,
      actual = solution.maxIceCream(
        costs = intArrayOf(1, 6, 3, 1, 2, 5),
        coins = 20,
      )
    )
  }
}
