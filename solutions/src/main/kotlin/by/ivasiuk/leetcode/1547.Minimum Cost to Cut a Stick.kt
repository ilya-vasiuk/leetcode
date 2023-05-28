package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/minimum-cost-to-cut-a-stick/">
 *   Minimum Cost to Cut a Stick</a>
 */
class MinimumCostToCutAStick {
  fun minCost(n: Int, cuts: IntArray): Int {
    cuts.sort()
    val m = cuts.size
    val dp = Array(m + 2) { IntArray(m + 2) }

    for (l in 2..m + 1) {
      var i = 0

      while (i + l <= m + 1) {
        val j = i + l

        dp[i][j] = (i + 1 until j).map { dp[i][it] + dp[it][j] }.min() +
            (if (j == m + 1) n else cuts[j - 1]) - (if (i == 0) 0 else cuts[i - 1])

        i++
      }
    }

    return dp[0][m + 1]
  }
}
