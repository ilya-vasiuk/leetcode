package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/number-of-longest-increasing-subsequence/">
 *   Number of Longest Increasing Subsequence</a>
 */
class NumberOfLongestIncreasingSubsequence {
  fun findNumberOfLIS(nums: IntArray): Int {
    var result = 0
    var maxLength = 0
    val count = IntArray(nums.size) { 1 }
    val length = IntArray(nums.size) { 1 }
    var current: Int

    for (i in nums.indices) {
      current = 1
      for (j in 0 until i) {
        if (nums[i] > nums[j]) {
          if (length[i] == length[j] + 1) {
            current += count[j]
          } else if (length[i] < length[j] + 1) {
            length[i] = length[j] + 1
            current = count[j]
          }
        }
      }

      if (length[i] == maxLength) {
        result += current
      } else if (length[i] > maxLength) {
        maxLength = length[i]
        result = current
      }

      count[i] = current
    }

    return result
  }
}
