package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/">
 *   Search in Rotated Sorted Array</a>
 */
class SearchInRotatedSortedArray {
  fun search(nums: IntArray, target: Int): Int =
    binarySearch(nums, 0, nums.size - 1, target)


  private fun binarySearch(nums: IntArray, left: Int, right: Int, target: Int): Int {
    if (left > right) {
      return -1
    }

    val middle = (right + left) / 2

    return if (nums[middle] == target) {
      middle
    } else if (nums[middle] >= nums[left]) {
      if (target >= nums[left] && target < nums[middle]) {
        binarySearch(nums, left, middle - 1, target)
      } else {
        binarySearch(nums, middle + 1, right, target)
      }
    } else {
      if (target > nums[middle] && target <= nums[right]) {
        binarySearch(nums, middle + 1, right, target)
      } else {
        binarySearch(nums, left, middle - 1, target)
      }
    }
  }
}