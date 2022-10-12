package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MedianOfTwoSortedArraysTest {
  private val solution = MedianOfTwoSortedArrays()

  @Test
  fun example1() {
    val result = solution.findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2))
    assertEquals(2.0, result)
  }

  @Test
  fun example2() {
    val result = solution.findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3, 4))
    assertEquals(2.5, result)
  }
}