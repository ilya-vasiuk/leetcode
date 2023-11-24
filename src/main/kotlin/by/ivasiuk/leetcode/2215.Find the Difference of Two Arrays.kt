package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Find the Difference of Two Arrays</a>
 */
class FindTheDifferenceOfTwoArrays {
  fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> =
    listOf(
      nums1.distinct()
        .filterNot { nums2.contains(it) },
      nums2.distinct()
        .filterNot { nums1.contains(it) }
    )
}
