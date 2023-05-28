package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-strength-of-a-group/">
 *   Maximum Strength of a Group</a>
 */
class MaximumStrengthOfAGroup {
  fun maxStrength(nums: IntArray): Long {
    if (nums.size == 1) {
      return nums[0].toLong()
    }

    nums.sort()

    var product = 1L
    var i = 0
    var notEmpty = false
    while (i < nums.lastIndex && nums[i] < 0 && nums[i + 1] < 0) {
      product *= nums[i] * nums[i + 1]
      i += 2
      notEmpty = true
    }

    i = nums.lastIndex
    while (i > 0 && nums[i] > 0 && nums[i - 1] > 0) {
      product *= nums[i] * nums[i - 1]
      i -= 2
      notEmpty = true
    }

    return when {
      !notEmpty -> nums.last().toLong()
      i >= 0 && nums[i] > 0 -> product * nums[i]
      else -> product
    }
  }
}
