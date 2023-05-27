package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class StoneGame3Test {
  private val solution = StoneGame3()

  @Test
  fun example1() {
    assertEquals(
      expected = "Bob",
      actual = solution.stoneGameIII(
        stoneValue = intArrayOf(1, 2, 3, 7)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "Alice",
      actual = solution.stoneGameIII(
        stoneValue = intArrayOf(1, 2, 3, -9)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "Tie",
      actual = solution.stoneGameIII(
        stoneValue = intArrayOf(1, 2, 3, 6)
      )
    )
  }
}
