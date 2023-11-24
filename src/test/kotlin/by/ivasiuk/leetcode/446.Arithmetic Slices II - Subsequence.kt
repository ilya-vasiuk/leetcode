package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ArithmeticSlices2SubsequenceTest {
  private val solution = ArithmeticSlices2Subsequence()

  @Test
  fun example1() {
    assertEquals(
      expected = 7,
      actual = solution.numberOfArithmeticSlices(
        nums = intArrayOf(2, 4, 6, 8, 10)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 16,
      actual = solution.numberOfArithmeticSlices(
        nums = intArrayOf(7, 7, 7, 7, 7)
      )
    )
  }
}
