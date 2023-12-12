package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumProductOfTwoElementsInAnArrayTest {
  private val solution = MaximumProductOfTwoElementsInAnArray()

  @Test
  fun example1() {
    assertEquals(
      expected = 12,
      actual = solution.maxProduct(
        nums = intArrayOf(3, 4, 5, 2)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 16,
      actual = solution.maxProduct(
        nums = intArrayOf(1, 5, 4, 5)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 12,
      actual = solution.maxProduct(
        nums = intArrayOf(3, 7)
      )
    )
  }
}
