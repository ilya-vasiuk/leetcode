package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/soup-servings/">Soup Servings</a>
 */
class SoupServings {
  fun soupServings(n: Int): Double {
    val dp = Array(200) { DoubleArray(200) { -1.0 } }
    dp.forEach { it[0] = 0.0 }
    dp[0].fill(1.0)
    dp[0][0] = 0.5

    fun solve(i: Int, j: Int): Double {
      if (dp[i][j] > -1.0) return dp[i][j]
      var ans = 0.0
      for (d in 1..4) {
        ans += 0.25 * solve(maxOf(i - d, 0), maxOf(j - 4 + d, 0))
      }

      return ans.also { dp[i][j] = it }
    }

    val x = (n + 24) / 25

    return if (x > 199) 1.0 else solve(x, x)
  }
}
