package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
class LongestCommonSubsequence {
  fun longestCommonSubsequence(text1: String, text2: String): Int {
    val m = text1.length
    val n = text2.length
    val match = Array(m + 1) { IntArray(n + 1) }

    for (i in 1..m) {
      for (j in 1..n) {
        match[i][j] =
          if (text1[i - 1] == text2[j - 1]) match[i - 1][j - 1] + 1 else maxOf(match[i - 1][j], match[i][j - 1])
      }
    }

    return match[m][n]
  }
}
