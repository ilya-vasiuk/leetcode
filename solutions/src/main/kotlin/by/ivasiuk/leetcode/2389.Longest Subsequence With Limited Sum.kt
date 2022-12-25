package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/longest-subsequence-with-limited-sum/">
 *   Longest Subsequence With Limited Sum</a>
 */
class LongestSubsequenceWithLimitedSum {
  fun answerQueries(nums: IntArray, queries: IntArray): IntArray {
    nums.sort()

    for (i in queries.indices) {
      var sum = 0
      var length = 0

      for (num in nums) {
        sum += num

        if (sum <= queries[i]) {
          length++
        } else {
          break
        }
      }

      queries[i] = length
    }

    return queries
  }
}
