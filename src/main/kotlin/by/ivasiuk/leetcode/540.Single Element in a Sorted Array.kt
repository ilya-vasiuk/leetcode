package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/single-element-in-a-sorted-array/">
 *   Single Element in a Sorted Array</a>
 */
class SingleElementInASortedArray {
  fun singleNonDuplicate(nums: IntArray): Int {
    if (nums.size == 1) {
      return nums[0]
    }
    var begin = 0
    var end = nums.size - 1

    while (begin <= end) {
      val middle = (end + begin) / 2

      if ((middle == 0 || nums[middle] != nums[middle - 1]) &&
        (middle == nums.size - 1 || nums[middle] != nums[middle + 1])) {
        return nums[middle]
      }

      if (middle % 2 == 1) {
        if (nums[middle] == nums[middle + 1]) {
          end = middle - 1
        } else {
          begin = middle + 1
        }
      } else {
        if (nums[middle] == nums[middle + 1]) {
          begin = middle + 2
        } else {
          end = middle - 2
        }
      }
    }

    return -1
  }
}
