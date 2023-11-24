package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/longest-palindromic-substring/">
 *   Longest Palindromic Substring</a>
 */
//TODO: Manacher's algorithm from wiki
class LongestPalindromicSubstring {
  fun longestPalindrome(s: String): String {
    val s1 = s.toCharArray().joinToString("|", "|", "|")

    var max = 0
    var center = -1
    var radius = 0
    val palindromeRadii = IntArray(s1.length)

    for (i in s1.indices) {
      var j = i + 1

      if (j < radius) {
        val pre = 2 * center - i
        j = minOf(radius, i + (palindromeRadii[pre] - pre))
      }

      while (j < s1.length && 2 * i - j >= 0 && s1[2 * i - j] == s1[j]) {
        j++
      }

      palindromeRadii[i] = j

      if (j - i > palindromeRadii[max] - max) {
        max = i
      }

      if (j > radius) {
        center = i
        radius = j
      }
    }

    return s1.slice(2 * max - palindromeRadii[max] + 1 until palindromeRadii[max])
      .filter { it != '|' }
  }
}
