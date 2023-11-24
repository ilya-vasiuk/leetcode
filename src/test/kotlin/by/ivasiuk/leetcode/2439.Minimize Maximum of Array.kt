package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimizeMaximumOfArrayTest {
  private val solution = MinimizeMaximumOfArray()

  @Test
  fun example1() {
    assertEquals(
      expected = 5,
      actual = solution.minimizeArrayValue(
        nums = intArrayOf(3,7,1,6),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 10,
      actual = solution.minimizeArrayValue(
        nums = intArrayOf(10, 0),
      )
    )
  }
}
