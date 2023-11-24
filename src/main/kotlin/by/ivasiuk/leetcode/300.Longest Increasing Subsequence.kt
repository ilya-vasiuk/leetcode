package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/longest-increasing-subsequence/">
 *   Longest Increasing Subsequence</a>
 */
class LongestIncreasingSubsequence {
  fun lengthOfLIS(nums: IntArray): Int {
    val max = IntArray(nums.size) { 1 }

    for (i in nums.indices) {
      for (j in 0 until i) {
        if (nums[j] < nums[i]) {
          if (max[j] + 1 > max[i]) {
            max[i] = max[j] + 1
          }
        }
      }
    }

    return max.max()
  }
}
