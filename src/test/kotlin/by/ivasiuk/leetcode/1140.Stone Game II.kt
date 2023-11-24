package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class StoneGame2Test {
  private val solution = StoneGame2()

  @Test
  fun example1() {
    assertEquals(
      expected = 10,
      actual = solution.stoneGameII(
        piles = intArrayOf(2, 7, 9, 4, 4)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 104,
      actual = solution.stoneGameII(
        piles = intArrayOf(1, 2, 3, 4, 5, 100)
      )
    )
  }
}
