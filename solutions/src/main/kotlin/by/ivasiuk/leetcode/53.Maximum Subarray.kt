package by.ivasiuk.leetcode

import kotlin.math.max

/**
 * @see <a href="https://leetcode.com/problems/maximum-subarray/">
 *   Maximum Subarray</a>
 */
class MaximumSubarray {
  fun maxSubArray(nums: IntArray): Int {
    return maxSubArray(nums, 0, nums.size - 1)
  }

  private fun maxSubArray(nums: IntArray, left: Int, right: Int): Int {
    if (left == right) {
      return nums[left]
    }

    val middle = (right + left) / 2
    var currentSum = 0

    var sumLeft = Int.MIN_VALUE
    for (i in middle downTo left) {
      currentSum += nums[i]
      sumLeft = max(currentSum, sumLeft)
    }

    currentSum = 0
    var sumRight = Int.MIN_VALUE
    for (i in middle + 1 until right + 1) {
      currentSum += nums[i]
      sumRight = max(currentSum, sumRight)
    }

    return setOf(
      sumLeft + sumRight,
      maxSubArray(nums, left, middle),
      maxSubArray(nums, middle + 1, right),
    ).max()
  }
}