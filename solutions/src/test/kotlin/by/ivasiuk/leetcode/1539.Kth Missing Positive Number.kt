package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class KthMissingPositiveNumberTest {
  private val solution = KthMissingPositiveNumber()

  @Test
  fun example1() {
    assertEquals(
      expected = 9,
      actual = solution.findKthPositive(
        arr = intArrayOf(2, 3, 4, 7, 11),
        k = 5
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 6,
      actual = solution.findKthPositive(
        arr = intArrayOf(1, 2, 3, 4),
        k = 2
      )
    )
  }
}
