package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/predict-the-winner/">
 *   Predict the Winner</a>
 */
class PredictTheWinner {
  fun PredictTheWinner(nums: IntArray): Boolean {
    val n = nums.size
    val dp = Array(n) { Array(n) { Pair(0, 0) } }

    for (i in nums.indices) {
      dp[i][i] = Pair(nums[i], 0)
    }

    for (i in n - 2 downTo 0) {
      for (j in i + 1 until n) {
        val left = nums[i] + dp[i + 1][j].second
        val right = nums[j] + dp[i][j - 1].second

        if (left > right) {
          dp[i][j] = Pair(left, dp[i + 1][j].first)
        } else {
          dp[i][j] = Pair(right, dp[i][j - 1].first)
        }
      }
    }

    return dp[0][n - 1].first >= dp[0][n - 1].second
  }
}
