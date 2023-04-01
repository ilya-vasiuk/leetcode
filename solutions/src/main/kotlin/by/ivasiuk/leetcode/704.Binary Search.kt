package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/binary-search/">Binary Search
 * </a>
 */
class BinarySearch {
  fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
      val middle = (left + right) / 2

      when {
        nums[middle] < target -> left = middle + 1
        nums[middle] > target -> right = middle - 1
        else -> return middle
      }
    }

    return -1
  }
}
