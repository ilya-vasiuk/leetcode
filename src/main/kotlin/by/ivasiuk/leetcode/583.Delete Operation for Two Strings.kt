package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/delete-operation-for-two-strings/">
 *   Delete Operation for Two Strings</a>
 */
class DeleteOperationForTwoStrings {
  fun minDistance(word1: String, word2: String): Int {
    val m = word1.length
    val n = word2.length
    val match = Array(m + 1) { IntArray(n + 1) }

    for (i in 1..m) {
      for (j in 1..n) {
        match[i][j] =
          if (word1[i - 1] == word2[j - 1]) match[i - 1][j - 1] + 1 else maxOf(match[i - 1][j], match[i][j - 1])
      }
    }

    return m - match[m][n] + n - match[m][n]
  }
}
