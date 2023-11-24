package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/">
 *   Find First and Last Position of Element in Sorted Array</a>
 */
class FindFirstAndLastPositionOfElementInSortedArray {
  fun searchRange(nums: IntArray, target: Int): IntArray =
    binarySearch(nums, 0, nums.size - 1, target)

  private fun binarySearch(nums: IntArray, left: Int, right: Int, target: Int): IntArray {
    if (left > right) {
      return intArrayOf(-1, -1)
    }

    val middle = (left + right) / 2

    return if (nums[middle] == target) {
      intArrayOf(
        if (middle > 0 && nums[middle - 1] < target) middle else searchLeftEnd(nums, left, middle - 1, target),
        if (middle < nums.size - 1 && nums[middle + 1] > target) middle else searchRightEnd(nums, middle + 1, right, target)
      )
    } else {
      if (nums[middle] > target) {
        binarySearch(nums, left, middle - 1, target)
      } else {
        binarySearch(nums, middle + 1, right, target)
      }
    }
  }

  private fun searchLeftEnd(nums: IntArray, left: Int, right: Int, target: Int): Int {
    val middle = (left + right) / 2

    return if (nums[middle] == target) {
      if (middle == left || nums[middle - 1] < target) {
        middle
      } else {
        searchLeftEnd(nums, left, middle - 1, target)
      }
    } else {
      searchLeftEnd(nums, middle + 1, right, target)
    }
  }

  private fun searchRightEnd(nums: IntArray, left: Int, right: Int, target: Int): Int {
    val middle = (left + right) / 2

    return if (nums[middle] == target) {
      if (middle == right || nums[middle + 1] > target) {
        middle
      } else {
        searchRightEnd(nums, middle + 1, right, target)
      }
    } else {
      searchRightEnd(nums, left, middle - 1, target)
    }
  }
}