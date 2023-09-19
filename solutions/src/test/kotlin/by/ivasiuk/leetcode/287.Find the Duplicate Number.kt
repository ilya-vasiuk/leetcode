package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindTheDuplicateNumberTest {
  private val solution = FindTheDuplicateNumber()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.findDuplicate(
        nums = intArrayOf(1, 3, 4, 2, 2)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.findDuplicate(
        nums = intArrayOf(3, 1, 3, 4, 2)
      )
    )
  }
}
