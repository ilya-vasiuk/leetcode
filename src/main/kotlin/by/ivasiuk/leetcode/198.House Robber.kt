package by.ivasiuk.leetcode

import kotlin.math.max

/**
 * @see <a href="https://leetcode.com/problems/house-robber/">
 *   House Robber</a>
 */
class HouseRobber {
  fun rob(nums: IntArray): Int {
    if (nums.size == 1) {
      return nums[0]
    }

    val robs = IntArray(nums.size)
    robs[0] = nums[0]
    robs[1] = max(nums[0], nums[1])

    for (i in 2 until nums.size) {
      robs[i] = max(nums[i] + robs[i - 2], robs[i - 1])
    }

    return robs.last()
  }
}