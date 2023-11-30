package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumOneBitOperationsToMakeIntegersZeroTest {
  private val solution = MinimumOneBitOperationsToMakeIntegersZero()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.minimumOneBitOperations(
        n = 3
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.minimumOneBitOperations(
        n = 6
      )
    )
  }
}
