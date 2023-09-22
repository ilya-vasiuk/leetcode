package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/is-subsequence/">Is Subsequence</a>
 */
class IsSubsequence {
  fun isSubsequence(s: String, t: String): Boolean {
    if (s.length > t.length) {
      return false
    }

    var i = 0
    var j = 0
    while (i < s.length && j < t.length) {
      if (s[i] == t[j]) {
        i++
      }

      j++
    }

    return i == s.length
  }
}
