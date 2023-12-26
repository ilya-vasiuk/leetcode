package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/decode-ways/">Decode Ways</a>
 */
class DecodeWays {
  fun numDecodings(s: String): Int {
    if (s[0] == '0') {
      return 0
    }

    val result = IntArray(s.length + 1)
    result[0] = 1

    for (i in 1..s.length) {
      if (s[i - 1] != '0') {
        result[i] = result[i - 1]
      }
      if (i > 1) {
        if ((s[i - 2] - '0') * 10 + (s[i - 1] - '0') in 10..26) {
          result[i] += result[i - 2]
        }
      }
    }

    return result[s.length]
  }
}
