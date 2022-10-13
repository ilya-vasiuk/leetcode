package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class MergeSortedArrayTest {
  private val solution = MergeSortedArray()

  @Test
  fun example1() {
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val nums2 = intArrayOf(2, 5, 6)
    solution.merge(nums1, 3, nums2, 3)
    assertContentEquals(intArrayOf(1, 2, 2, 3, 5, 6), nums1)
  }

  @Test
  fun example2() {
    val nums1 = intArrayOf(1)
    val nums2 = intArrayOf()
    solution.merge(nums1, 1, nums2, 0)
    assertContentEquals(intArrayOf(1), nums1)
  }

  @Test
  fun example3() {
    val nums1 = intArrayOf(0)
    val nums2 = intArrayOf(1)
    solution.merge(nums1, 0, nums2, 1)
    assertContentEquals(intArrayOf(1), nums1)
  }
}