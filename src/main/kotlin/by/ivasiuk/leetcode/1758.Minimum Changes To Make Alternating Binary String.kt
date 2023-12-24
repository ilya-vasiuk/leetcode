package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/">
 *   Minimum Changes To Make Alternating Binary String</a>
 */
class MinimumChangesToMakeAlternatingBinaryString {
  fun minOperations(s: String): Int {
    var sub1 = 0
    var sub2 = 0
    var prevBoundary = 0

    for (i in 1..s.lastIndex) {
      if (s[i - 1] == s[i]) {
        sub1 += i - prevBoundary
        sub1 = sub2.also { sub2 = sub1 }
        prevBoundary = i
      }
    }

    sub1 += s.length - prevBoundary

    return minOf(sub1, sub2)
  }
}
