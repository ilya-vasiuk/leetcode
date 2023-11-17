package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimizeMaximumPairSumInArrayTest {
  private val solution = MinimizeMaximumPairSumInArray()

  @Test
  fun example1() {
    assertEquals(
      expected = 7,
      actual = solution.minPairSum(
        nums = intArrayOf(3, 5, 2, 3),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 8,
      actual = solution.minPairSum(
        nums = intArrayOf(3, 5, 4, 2, 4, 6),
      )
    )
  }
}
