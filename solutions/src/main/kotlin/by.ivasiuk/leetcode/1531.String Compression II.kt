package by.ivasiuk.leetcode

import kotlin.math.min

/**
 * @see <a href="https://leetcode.com/problems/dstring-compression-ii/">
 *   String Compression II</a>
 */
//TODO: stolen solution
class StringCompression2 {
  private lateinit var dp: Array<IntArray>

  fun getLengthOfOptimalCompression(s: String, k: Int): Int {
    dp = Array(s.length) { IntArray(k + 1) { -1 } }

    return dp(0, k, s.toCharArray())
  }

  private fun dp(i: Int, k: Int, origLine: CharArray): Int {
    if (k < 0) {
      return origLine.size
    }
    if (origLine.size <= i + k) {
      return 0
    }

    if (dp[i][k] != -1) {
      return dp[i][k]
    }
    var ans = dp(i + 1, k - 1, origLine)

    var length = 0
    var same = 0
    var diff = 0
    var j = i
    while (j < origLine.size && diff <= k) {
      if (origLine[j] == origLine[i]) {
        same++
        if (same <= 2 || same == 10 || same == 100) length++
      } else {
        diff++
      }
      ans = min(ans, length + dp(j++ + 1, k - diff, origLine))
    }
    dp[i][k] = ans

    return ans
  }
}