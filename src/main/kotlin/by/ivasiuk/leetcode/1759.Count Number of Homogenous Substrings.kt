package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/count-number-of-homogenous-substrings/">
 *   Count Number of Homogenous Substrings</a>
 */
class CountNumberOfHomogenousSubstrings {
  fun countHomogenous(s: String): Int {
    var result = 0L
    var current = 1L

    for (i in 1 .. s.lastIndex) {
      if (s[i - 1] == s[i]) {
        current++
      } else {
        result += (current * (current + 1) / 2) % MODULO
        current = 1
      }
    }

    result += (current * (current + 1) / 2) % MODULO

    return result.toInt()
  }

  companion object {
    const val MODULO = 1_000_000_007
  }
}
