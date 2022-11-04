package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/house-robber-ii/">
 *   House Robber II</a>
 */
class HouseRobber2 {
  fun rob(nums: IntArray): Int {
    if (nums.size == 1) {
      return nums[0]
    }

    return maxOf(
      calc(nums, 0, nums.size - 1),
      calc(nums, 1, nums.size)
    )
  }

  private fun calc(nums: IntArray, start: Int, end: Int): Int {
    var prev = 0
    var curr = 0

    for (i in start until end) {
      val tmp = maxOf(nums[i] + prev, curr)
      prev = curr
      curr = tmp
    }

    return curr
  }
}