package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-score-after-splitting-a-string/">
 *   Maximum Score After Splitting a String</a>
 */
class MaximumScoreAfterSplittingAString {
  fun maxScore(s: String): Int {
    var zeros = 0
    for (c in s) {
      if (c == '0') {
        zeros++
      }
    }
    val ones = s.length - zeros

    var z = if (s[0] == '0') 1 else 0
    var o = if (s[0] == '1') ones - 1 else ones
    var max = z + o

    for (i in 1 until s.length - 1) {
      if (s[i] == '0') {
        z++
      } else {
        o--
      }

      max = maxOf(max, z + o)
    }

    return max
  }
}
