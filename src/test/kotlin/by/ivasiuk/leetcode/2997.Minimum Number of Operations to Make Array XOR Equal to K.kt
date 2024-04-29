package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumNumberOfOperationsToMakeArrayXOREqualToKTest {
  private val solution = MinimumNumberOfOperationsToMakeArrayXOREqualToK()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.minOperations(
        nums = intArrayOf(2, 1, 3, 4),
        k = 1,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.minOperations(
        nums = intArrayOf(2, 0, 2, 0),
        k = 0,
      )
    )
  }
}
