package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumElementAfterDecreasingAndRearrangingTest {
  private val solution = MaximumElementAfterDecreasingAndRearranging()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.maximumElementAfterDecrementingAndRearranging(
        arr = intArrayOf(2, 2, 1, 2, 1),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.maximumElementAfterDecrementingAndRearranging(
        arr = intArrayOf(100, 1, 1000),
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 5,
      actual = solution.maximumElementAfterDecrementingAndRearranging(
        arr = intArrayOf(1, 2, 3, 4, 5),
      )
    )
  }
}
