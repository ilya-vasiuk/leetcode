package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/longest-ideal-subsequence/">
 *   Longest Ideal Subsequence</a>
 */
class LongestIdealSubsequence {
  fun longestIdealString(s: String, k: Int): Int {
    if (k == 25) {
      return s.length
    }

    val alphabet = IntArray(128)

    fun maxInRange(ch: Int): Int {
      val from = ch - k
      val to = (ch + k).coerceAtMost(122)
      var max = alphabet[to]

      for (i in from until to) {
        max = maxOf(alphabet[i], max)
      }

      return max
    }

    var maxLength = 1
    var curLength = 0

    for (ch in s) {
      curLength = maxInRange(ch.code) + 1
      alphabet[ch.code] = curLength
      maxLength = maxOf(curLength, maxLength)
    }

    return maxLength
  }
}
