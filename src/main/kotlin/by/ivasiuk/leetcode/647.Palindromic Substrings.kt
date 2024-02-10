package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/palindromic-substrings/">Palindromic Substrings</a>
 */
class PalindromicSubstrings {
  fun countSubstrings(s: String): Int {
    fun check(i: Int, j: Int): Int {
      var count = 0
      var left = i
      var right = j

      while (left >= 0 && right < s.length && s[left] == s[right]) {
        count++
        left--
        right++
      }

      return count
    }

    return (1 until s.length)
      .fold(1) { acc, i -> acc + check(i, i) + check(i - 1, i) }
  }
}
