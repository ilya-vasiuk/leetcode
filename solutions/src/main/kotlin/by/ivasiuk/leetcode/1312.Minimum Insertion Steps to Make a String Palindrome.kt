package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/">
 *   Minimum Insertion Steps to Make a String Palindrome</a>
 */
class MinimumInsertionStepsToMakeAStringPalindrome {
  fun minInsertions(s: String): Int {
    val n = s.length
    val steps = Array(n + 1) { IntArray(n + 1) }.also {
      s.indices.forEach { i -> it[i][i] = 1 }
    }
    var max = 1

    for (i in s.indices.reversed()) {
      for (j in i + 1 until n) {
        steps[i][j] = if (s[i] == s[j]) {
          2 + steps[i + 1][j - 1]
        } else {
          maxOf(steps[i + 1][j], steps[i][j - 1])
        }

        max = maxOf(max, steps[i][j])
      }
    }

    return n - max
  }
}
