package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/number-of-music-playlists/">
 *   Number of Music Playlists</a>
 */
class NumberOfMusicPlaylists {
  fun numMusicPlaylists(n: Int, goal: Int, k: Int): Int {
    val dp = Array(goal + 1) { LongArray(n + 1) }.also {
      it[0][0] = 1L
    }

    for (g in 1..goal) {
      val songs = minOf(g, n)

      for (s in 1..songs) {
        dp[g][s] = dp[g - 1][s - 1] * (n - s + 1) % MODULO

        if (s > k) {
          dp[g][s] = (dp[g][s] + dp[g - 1][s] * (s - k)) % MODULO
        }
      }
    }

    return dp[goal][n].toInt()
  }

  companion object {
    const val MODULO = 1_000_000_007
  }
}
