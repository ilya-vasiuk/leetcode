package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FirstMissingPositiveTest {
  private val solution = FirstMissingPositive()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.firstMissingPositive(
        nums = intArrayOf(1, 2, 0),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.firstMissingPositive(
        nums = intArrayOf(3, 4, -1, 1),
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1,
      actual = solution.firstMissingPositive(
        nums = intArrayOf(7, 8, 9, 11, 12),
      )
    )
  }
}
