package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class IntersectionOfTwoArraysTest {
  private val solution = IntersectionOfTwoArrays()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(2),
      actual = solution.intersection(
        nums1 = intArrayOf(1, 2, 2, 1),
        nums2 = intArrayOf(2, 2),
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(9, 4),
      actual = solution.intersection(
        nums1 = intArrayOf(4, 9, 5),
        nums2 = intArrayOf(9, 4, 9, 8, 4),
      )
    )
  }
}
