package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/merge-sorted-array/">
 *   Merge Sorted Array</a>
 */
class MergeSortedArray {
  fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    var i = m - 1
    var j = n - 1
    while (j >= 0) {
      while (i >= 0 && nums1[i] > nums2[j]) {
        nums1[i + j + 1] = nums1[i--]
      }
      nums1[i + j + 1] = nums2[j--]
    }
  }
}