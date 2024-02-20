package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MissingNumberTest {
  private val solution = MissingNumber()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.missingNumber(
        nums = intArrayOf(3, 0, 1)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.missingNumber(
        nums = intArrayOf(0, 1)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 8,
      actual = solution.missingNumber(
        nums = intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)
      )
    )
  }
}
