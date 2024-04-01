package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/length-of-last-word/">
 *   Length of Last Word</a>
 */
class LengthOfLastWord {
  fun lengthOfLastWord(s: String): Int {
    var i = s.length
    var length = 0

    while (i-- > 0) {
      if (s[i] != ' ') {
        length++
      } else if (length > 0) {
        return length
      }
    }

    return length
  }
}
