package by.ivasiuk.leetcode

import kotlin.math.abs

/**
 * @see <a href="https://leetcode.com/problems/3sum-closest/">3Sum Closest</a>
 */
class ThreeSumClosest {
  fun threeSumClosest(nums: IntArray, target: Int): Int {
    var result = Int.MIN_VALUE
    nums.sort()

    for (i in 0 until nums.size - 2) {
      var j = i + 1
      var k = nums.size - 1

      while (j < k) {
        val sum = nums[i] + nums[j] + nums[k]

        if (sum == target) {
          return target
        } else {
          if (result == Int.MIN_VALUE || abs(target - result) > abs(target - sum)) {
            result = sum
          }
          if (sum < target) j++ else k--
        }
      }
    }

    return result
  }
}