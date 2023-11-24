package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/decoded-string-at-index/">
 *   Decoded String at Index</a>
 */
class DecodedStringAtIndex {
  fun decodeAtIndex(s: String, k: Int): String {
    var size = 0L
    var i = 0

    while (i < s.length) {
      if (s[i].isDigit()) {
        size *= (s[i] - '0')
      } else {
        size++
      }

      i++

      if (size >= k) {
        break
      }
    }

    i--

    var updatedK = k.toLong()

    while (i >= 0) {
      updatedK %= size

      if (updatedK == 0L && s[i].isLetter()) {
        return s[i].toString()
      }

      if (s[i].isDigit()) {
        size /= (s[i] - '0')
      } else {
        size--
      }

      i--
    }

    return ""
  }
}
