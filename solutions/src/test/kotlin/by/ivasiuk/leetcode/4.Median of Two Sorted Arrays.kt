package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MedianOfTwoSortedArraysTest {
  private val solution = MedianOfTwoSortedArrays()

  @Test
  fun example1() {
    assertEquals(
      expected = 2.0,
      actual = solution.findMedianSortedArrays(
        nums1 = intArrayOf(1, 3),
        nums2 = intArrayOf(2)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2.5,
      actual = solution.findMedianSortedArrays(
        nums1 = intArrayOf(1, 2),
        nums2 = intArrayOf(3, 4)
      )
    )
  }
}
