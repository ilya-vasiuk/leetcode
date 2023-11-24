package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/arithmetic-slices/">Arithmetic Slices</a>
 */
class ArithmeticSlices {
  fun numberOfArithmeticSlices(nums: IntArray): Int {
    var result = 0
    var current = 0

    for (i in 0 until nums.size - 2) {
      if (nums[i] - nums[i + 1] == nums[i + 1] - nums[i + 2]) {
        result += ++current
      } else {
        current = 0
      }
    }

    return result
  }
}
