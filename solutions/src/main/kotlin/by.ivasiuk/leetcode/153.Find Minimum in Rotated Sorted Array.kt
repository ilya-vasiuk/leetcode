package by.ivasiuk.leetcode

import kotlin.math.min

/**
 * @see <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/">
 *   Find Minimum in Rotated Sorted Array</a>
 */
class FindMinimumInRotatedSortedArray {
  fun findMin(nums: IntArray): Int =
    binarySearch(nums, 0, nums.size - 1, Int.MAX_VALUE)

  private fun binarySearch(nums: IntArray, left: Int, right: Int, min: Int): Int =
    if (left > right) {
      Int.MAX_VALUE
    } else {
      if (nums[left] > nums[right]) {
        val middle = (right + left) / 2

        if (nums[middle] > nums[right]) {
          min(nums[middle], binarySearch(nums, middle + 1, right, min))
        } else {
          min(nums[middle], binarySearch(nums, left, middle - 1, min))
        }
      } else {
        min(nums[left], min)
      }
    }
}