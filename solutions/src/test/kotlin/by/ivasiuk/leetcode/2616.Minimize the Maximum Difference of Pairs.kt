package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimizeTheMaximumDifferenceOfPairsTest {
  private val solution = MinimizeTheMaximumDifferenceOfPairs()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.minimizeMax(
        nums = intArrayOf(10, 1, 2, 7, 1, 3),
        p = 2,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.minimizeMax(
        nums = intArrayOf(4, 2, 1, 2),
        p = 1,
      )
    )
  }
}
