package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
class IsomorphicStrings {
  fun isIsomorphic(s: String, t: String): Boolean {
    val sChars = mutableMapOf<Char, Char>()
    val tChars = mutableMapOf<Char, Char>()

    for (i in s.indices) {
      if (sChars.getOrPut(s[i]) { t[i] } != t[i] || tChars.getOrPut(t[i]) { s[i] } != s[i]) {
        return false
      }
    }

    return true
  }
}
