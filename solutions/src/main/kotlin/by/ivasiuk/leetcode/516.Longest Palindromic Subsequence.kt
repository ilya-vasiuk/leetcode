package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/longest-palindromic-subsequence/">
 *   Longest Palindromic Subsequence</a>
 */
class LongestPalindromicSubsequence {
  fun longestPalindromeSubseq(s: String): Int {
    val cache = Array(s.length) { IntArray(s.length) }

    fun check(s: String, i: Int, j: Int): Int =
      when {
        cache[i][j] != 0 -> cache[i][j]
        i > j -> 0
        i == j -> 1
        else -> {
          cache[i][j] = if (s[i] == s[j]) {
            check(s, i + 1, j - 1) + 2
          } else {
            maxOf(check(s, i + 1, j), check(s, i, j - 1))
          }

          cache[i][j]
        }
    }

    return check(s, 0, s.length - 1)
  }
}
