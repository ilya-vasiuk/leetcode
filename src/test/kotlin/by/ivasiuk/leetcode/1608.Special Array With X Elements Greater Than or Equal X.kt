package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SpecialArrayWithXElementsGreaterThanOrEqualXTest {
  private val solution = SpecialArrayWithXElementsGreaterThanOrEqualX()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.specialArray(
        nums = intArrayOf(2, 5),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = -1,
      actual = solution.specialArray(
        nums = intArrayOf(0, 0),
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 3,
      actual = solution.specialArray(
        nums = intArrayOf(0, 4, 3, 0, 4),
      )
    )
  }
}
