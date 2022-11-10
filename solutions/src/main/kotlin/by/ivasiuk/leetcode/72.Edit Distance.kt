package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/edit-distance/">Edit Distance</a>
 */
class EditDistance {
  fun minDistance(word1: String, word2: String): Int {
    val m = word1.length
    val n = word2.length
    val result = Array(m + 1) { IntArray(n + 1) }

    for (i in 0..m) {
      result[i][0] = i
    }

    for (j in 0..n) {
      result[0][j] = j
    }

    for (i in 1..m) {
      for (j in 1..n) {
        if (word1[i - 1] == word2[j - 1]) {
          result[i][j] = result[i - 1][j - 1]
        } else {
          result[i][j] = 1 + minOf(
            result[i - 1][j - 1],
            result[i][j - 1],
            result[i - 1][j]
          )
        }
      }
    }

    return result[m][n]
  }
}
