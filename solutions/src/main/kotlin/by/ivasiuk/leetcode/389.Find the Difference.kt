package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-the-difference/">Find the Difference</a>
 */
class FindTheDifference {
  fun findTheDifference(s: String, t: String): Char =
    s.indices
      .fold(t[t.length - 1].code) { acc, i ->
        acc + t[i].code - s[i].code
      }
      .toChar()
}
