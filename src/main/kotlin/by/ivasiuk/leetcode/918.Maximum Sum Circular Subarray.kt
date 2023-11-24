package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-sum-circular-subarray/">
 *   Maximum Sum Circular Subarray</a>
 */
class MaximumSumCircularSubarray {
  fun maxSubarraySumCircular(nums: IntArray): Int {
    var totalSum = 0
    val nonCircularSum = kadane(nums)

    for (i in nums.indices) {
      totalSum += nums[i]
      nums[i] = -nums[i]
    }

    val circularSum = totalSum + kadane(nums)

    return if (circularSum == 0) nonCircularSum else maxOf(nonCircularSum, circularSum)
  }

  private fun kadane(nums: IntArray): Int {
    var currentSum = nums[0]
    var maxSum = nums[0]

    for (i in 1 until nums.size) {
      if (currentSum < 0) {
        currentSum = 0
      }
      currentSum += nums[i]
      maxSum = maxOf(maxSum, currentSum)
    }

    return maxSum
  }
}
