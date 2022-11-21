package by.ivasiuk.leetcode

import java.lang.StringBuilder

/**
 * @see <a href="https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/">
 *   Decrypt String from Alphabet to Integer Mapping</a>
 */
class DecryptStringFromAlphabetToIntegerMapping {
  fun freqAlphabets(s: String): String {
    var i = s.length - 1
    val result = StringBuilder()

    while (i >= 0) {
      val current: Int
      if (s[i] == '#') {
        current = ("" + s[i - 2] + s[i - 1]).toInt()
        i -= 2
      } else {
        current = Character.getNumericValue(s[i])
      }

      result.insert(0, 'a' + current - 1)
      i--
    }

    return result.toString()
  }
}
