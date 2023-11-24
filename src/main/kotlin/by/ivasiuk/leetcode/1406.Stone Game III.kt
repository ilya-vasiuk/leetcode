package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/stone-game-iii/">Stone Game III</a>
 */
class StoneGame3 {
  fun stoneGameIII(stoneValue: IntArray): String {
    val n = stoneValue.size
    val dp = IntArray(3)

    for (i in n - 1 downTo 0) {
      dp[i % 3] = maxOf(
        stoneValue[i] - dp[(i + 1) % 3],
        if (i + 1 < n) stoneValue[i] + stoneValue[i + 1] - dp[(i + 2) % 3] else Int.MIN_VALUE,
        if (i + 2 < n) stoneValue[i] + stoneValue[i + 1] + stoneValue[i + 2] - dp[(i + 3) % 3] else Int.MIN_VALUE
      )
    }

    return when {
      dp[0] > 0 -> "Alice"
      dp[0] < 0 -> "Bob"
      else -> "Tie"
    }
  }
}
