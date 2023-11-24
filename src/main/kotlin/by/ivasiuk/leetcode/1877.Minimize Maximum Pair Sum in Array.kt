package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/">
 *   Minimize Maximum Pair Sum in Array</a>
 */
class MinimizeMaximumPairSumInArray {
  fun minPairSum(nums: IntArray): Int {
    var max = 0
    var i = 0
    var j = nums.lastIndex

    nums.sort()

    while (i < j) {
      max = maxOf(max, nums[i++] + nums[j--])
    }

    return max
  }
}
