package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/first-missing-positive/">First Missing Positive</a>
 */
class FirstMissingPositive {
  fun firstMissingPositive(nums: IntArray): Int {
    var i = 0

    while (i < nums.size) {
      if (nums[i] - 1 in nums.indices && nums[nums[i] - 1] != nums[i]) {
        nums[nums[i] - 1] = nums[i].also { nums[i] = nums[nums[i] - 1] }
      } else {
        i++
      }
    }

    var result = 1
    while (result - 1 < nums.size) {
      if (nums[result - 1] != result) {
        return result
      }

      result++
    }

    return nums.size + 1
  }
}
