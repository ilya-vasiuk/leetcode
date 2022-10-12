package by.ivasiuk.leetcode

import java.util.*
import java.util.stream.IntStream

/**
 * @see <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">
 *   Median of Two Sorted Arrays</a>
 */
class MedianOfTwoSortedArrays {
  fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val list: List<Int> = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2))
      .sorted()
      .boxed()
      .toList()

    return if (list.size % 2 == 0) {
      ((list[list.size / 2] + list[list.size / 2 - 1]) / 2.0)
    } else {
      list[list.size / 2].toDouble()
    }
  }
}