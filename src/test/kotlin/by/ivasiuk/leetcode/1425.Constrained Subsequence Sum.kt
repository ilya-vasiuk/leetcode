package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ConstrainedSubsequenceSumTest {
  private val solution = ConstrainedSubsequenceSum()

  @Test
  fun example1() {
    assertEquals(
      expected = 37,
      actual = solution.constrainedSubsetSum(
        nums = intArrayOf(10, 2, -10, 5, 20),
        k = 2,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = -1,
      actual = solution.constrainedSubsetSum(
        nums = intArrayOf(-1, -2, -3),
        k = 1,
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 23,
      actual = solution.constrainedSubsetSum(
        nums = intArrayOf(10, -2, -10, -5, 20),
        k = 2,
      )
    )
  }
}
