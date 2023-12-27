package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumTimeToMakeRopeColorfulTest {
  private val solution = MinimumTimeToMakeRopeColorful()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.minCost(
        colors = "abaac",
        neededTime = intArrayOf(1, 2, 3, 4, 5),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.minCost(
        colors = "abc",
        neededTime = intArrayOf(1, 2, 3),
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 2,
      actual = solution.minCost(
        colors = "aabaa",
        neededTime = intArrayOf(1, 2, 3, 4, 1),
      )
    )
  }
}
