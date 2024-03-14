package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class BinarySubarraysWithSumTest {
  private val solution = BinarySubarraysWithSum()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.numSubarraysWithSum(
        nums = intArrayOf(1, 0, 1, 0, 1),
        goal = 2,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 15,
      actual = solution.numSubarraysWithSum(
        nums = intArrayOf(0, 0, 0, 0, 0),
        goal = 0,
      )
    )
  }
}
