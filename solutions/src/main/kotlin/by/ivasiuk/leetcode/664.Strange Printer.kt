package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/strange-printer/">
 *   Strange Printer</a>
 */
class StrangePrinter {
  fun strangePrinter(s: String): Int {
    val n = s.length
    val dp = Array(n) { IntArray(n) }

    for (i in n - 1 downTo 0) {
      dp[i][i] = 1

      for (j in i + 1 until n) {
        dp[i][j] = dp[i][j - 1] + 1

        for (k in i until j) {
          if (s[k] == s[j]) {
            dp[i][j] = minOf(dp[i][j], dp[i][k] + if (k + 1 <= j - 1) dp[k + 1][j - 1] else 0)
          }
        }
      }
    }

    return dp[0][n - 1]
  }
}
