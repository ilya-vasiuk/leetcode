package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimizeDeviationInArrayTest {
  private val solution = MinimizeDeviationInArray()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.minimumDeviation(
        nums = intArrayOf(1, 2, 3, 4)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.minimumDeviation(
        nums = intArrayOf(4, 1, 5, 20, 3)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 3,
      actual = solution.minimumDeviation(
        nums = intArrayOf(2, 10, 8)
      )
    )
  }
}
