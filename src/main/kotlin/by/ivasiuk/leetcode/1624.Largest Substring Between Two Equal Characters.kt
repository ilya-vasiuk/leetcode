package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/largest-substring-between-two-equal-characters/">
 *   Largest Substring Between Two Equal Characters</a>
 */
class LargestSubstringBetweenTwoEqualCharacters {
  fun maxLengthBetweenEqualCharacters(s: String): Int {
    val mins = IntArray(26) { -1 }
    var max = -1

    for (i in s.indices) {
      val c = s[i] - 'a'

      if (mins[c] == -1) {
        mins[c] = i
      } else {
        max = maxOf(max, i - mins[c] - 1)
      }
    }

    return max
  }
}
