package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class FindTheDifferenceOfTwoArraysTest {
  private val solution = FindTheDifferenceOfTwoArrays()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = listOf(listOf(1, 3), listOf(4, 6)),
      actual = solution.findDifference(
        nums1 = intArrayOf(1, 2, 3),
        nums2 = intArrayOf(2, 4, 6)
      )
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = listOf(listOf(3), listOf()),
      actual = solution.findDifference(
        nums1 = intArrayOf(1, 2, 3, 3),
        nums2 = intArrayOf(1, 1, 2, 2)
      )
    )
  }
}
