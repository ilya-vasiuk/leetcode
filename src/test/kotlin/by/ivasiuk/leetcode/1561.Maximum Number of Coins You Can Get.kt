package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumNumberOfCoinsYouCanGetTest {
  private val solution = MaximumNumberOfCoinsYouCanGet()

  @Test
  fun example1() {
    assertEquals(
      expected = 9,
      actual = solution.maxCoins(
        piles = intArrayOf(2, 4, 1, 2, 7, 8)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.maxCoins(
        piles = intArrayOf(2, 4, 5)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 18,
      actual = solution.maxCoins(
        piles = intArrayOf(9, 8, 7, 6, 5, 1, 2, 3, 4)
      )
    )
  }
}
