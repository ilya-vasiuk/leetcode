package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/stone-game-ii/">Stone Game II</a>
 */
class StoneGame2 {
  fun stoneGameII(piles: IntArray): Int {
    val n = piles.size
    val dp = Array(n) { IntArray(n + 1) }
    val suffixSums = IntArray(n + 1).also {
      it[n - 1] = piles.last()

      for (i in n - 2 downTo 0) {
        it[i] = it[i + 1] + piles[i]
      }
    }

    for (i in n - 1 downTo 0) {
      for (m in 1..n) {
        dp[i][m] = if (i + 2 * m >= n) {
          suffixSums[i]
        } else {
          (1..2 * m)
            .maxOf { suffixSums[i] - dp[i + it][maxOf(it, m)] }
        }
      }
    }

    return dp[0][1]
  }
}
