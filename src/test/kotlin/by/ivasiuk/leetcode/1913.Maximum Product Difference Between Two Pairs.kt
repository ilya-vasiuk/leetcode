package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumProductDifferenceBetweenTwoPairsTest {
  private val solution = MaximumProductDifferenceBetweenTwoPairs()

  @Test
  fun example1() {
    assertEquals(
      expected = 34,
      actual = solution.maxProductDifference(
        nums = intArrayOf(5, 6, 2, 7, 4)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 64,
      actual = solution.maxProductDifference(
        nums = intArrayOf(4, 2, 5, 9, 7, 4, 8)
      )
    )
  }
}
