package by.ivasiuk.leetcode

import kotlin.math.min

/**
 * @see <a href="https://leetcode.com/problems/minimum-size-subarray-sum/">
 *   Minimum Size Subarray Sum</a>
 */
class MinimumSizeSubarraySum {
  fun minSubArrayLen(target: Int, nums: IntArray): Int {
    var left = 0
    var sum = 0
    var result = Int.MAX_VALUE

    for (i in nums.indices) {
      sum += nums[i]
      while (sum >= target) {
        result = min(result, i - left + 1)
        sum -= nums[left++]
      }
    }

    return if (result == Int.MAX_VALUE) 0 else result
  }
}
