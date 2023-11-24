package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumValueAtAGivenIndexInABoundedArrayTest {
  private val solution = MaximumValueAtAGivenIndexInABoundedArray()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.maxValue(
        n = 4,
        index = 2,
        maxSum = 6
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.maxValue(
        n = 6,
        index = 1,
        maxSum = 10
      )
    )
  }
}
