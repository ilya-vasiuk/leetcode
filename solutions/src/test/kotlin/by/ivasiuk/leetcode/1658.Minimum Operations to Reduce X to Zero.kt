package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumOperationsToReduceXToZeroTest {
  private val solution = MinimumOperationsToReduceXToZero()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.minOperations(
        nums = intArrayOf(1, 1, 4, 2, 3),
        x = 5
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = -1,
      actual = solution.minOperations(
        nums = intArrayOf(5, 6, 7, 8, 9),
        x = 4
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 5,
      actual = solution.minOperations(
        nums = intArrayOf(3, 2, 20, 1, 1, 3),
        x = 10
      )
    )
  }
}
