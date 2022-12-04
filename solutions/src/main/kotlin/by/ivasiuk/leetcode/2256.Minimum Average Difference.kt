package by.ivasiuk.leetcode

import kotlin.math.abs

/**
 * @see <a href="https://leetcode.com/problems/minimum-average-difference/">
 *   Minimum Average Difference</a>
 */
class MinimumAverageDifference {
  fun minimumAverageDifference(nums: IntArray): Int {
    if (nums.size < 2) {
      return 0
    }

    var sum = 0L
    val sums = Array(nums.size) { i ->
      sum += nums[i]
      sum
    }

    var min = abs(nums[0] - (sum - nums[0]) / (nums.size - 1))
    var minIndex = 0

    for (i in 1 until sums.size - 1) {
      val current = abs(sums[i] / (i + 1) - (sum - sums[i]) / (nums.size - (i + 1)))

      if (current < min) {
        min = current
        minIndex = i
      }
    }

    return if (sums[nums.size - 1] / nums.size < min) nums.size - 1 else minIndex
  }
}
