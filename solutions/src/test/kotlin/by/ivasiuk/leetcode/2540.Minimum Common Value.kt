package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumCommonValueTest {
  private val solution = MinimumCommonValue()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.getCommon(
        nums1 = intArrayOf(1, 2, 3),
        nums2 = intArrayOf(2, 4),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.getCommon(
        nums1 = intArrayOf(1, 2, 3, 6),
        nums2 = intArrayOf(2, 3, 4, 5),
      )
    )
  }
}
