package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumNumberOfOperationsToMakeArrayContinuousTest {
  private val solution = MinimumNumberOfOperationsToMakeArrayContinuous()

  @Test
  fun example1() {
    assertEquals(
      expected = 0,
      actual = solution.minOperations(
        nums = intArrayOf(4, 2, 5, 3)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.minOperations(
        nums = intArrayOf(1, 2, 3, 5, 6)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 3,
      actual = solution.minOperations(
        nums = intArrayOf(1, 10, 100, 1000)
      )
    )
  }
}
