package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ElementAppearingMoreThan25InSortedArrayTest {
  private val solution = ElementAppearingMoreThan25InSortedArray()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.findSpecialInteger(
        arr = intArrayOf(1, 2, 2, 6, 6, 6, 6, 7, 10)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.findSpecialInteger(
        arr = intArrayOf(1, 1)
      )
    )
  }
}
