package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ArithmeticSlicesTest {
  private val solution = ArithmeticSlices()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.numberOfArithmeticSlices(
        nums = intArrayOf(1, 2, 3, 4)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.numberOfArithmeticSlices(
        nums = intArrayOf(1)
      )
    )
  }
}
