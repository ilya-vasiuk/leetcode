package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">
 *   Median of Two Sorted Arrays</a>
 */
class MedianOfTwoSortedArrays {
  fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    if (nums1.size > nums2.size) {
      return findMedianSortedArrays(nums2, nums1)
    }

    val m = nums1.size
    val n = nums2.size
    var left = 0
    var right = m

    while (left <= right) {
      val partitionX = (left + right) / 2
      val partitionY = (m + n + 1) / 2 - partitionX
      val maxX = if (partitionX == 0) Int.MIN_VALUE else nums1[partitionX - 1]
      val maxY = if (partitionY == 0) Int.MIN_VALUE else nums2[partitionY - 1]
      val minX = if (partitionX == m) Int.MAX_VALUE else nums1[partitionX]
      val minY = if (partitionY == n) Int.MAX_VALUE else nums2[partitionY]

      when {
        maxX <= minY && maxY <= minX -> return if ((m + n) % 2 == 0) {
          (maxOf(maxX, maxY) + minOf(minX, minY)) / 2.0
        } else {
          maxOf(maxX, maxY).toDouble()
        }
        maxX > minY -> right = partitionX - 1
        else -> left = partitionX + 1
      }
    }

    return -1.0
  }
}
