package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumAverageDifferenceTest {
  private val solution = MinimumAverageDifference()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.minimumAverageDifference(
        nums = intArrayOf(2, 5, 3, 9, 5, 3)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.minimumAverageDifference(
        nums = intArrayOf(0)
      )
    )
  }
}
