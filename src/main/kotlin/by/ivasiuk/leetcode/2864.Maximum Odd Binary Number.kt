package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-odd-binary-number/">
 *   Maximum Odd Binary Number</a>
 */
class MaximumOddBinaryNumber {
  fun maximumOddBinaryNumber(s: String): String {
    val ones = s.count { it == '1' }

    return "1".repeat(ones - 1) + "0".repeat(s.length - ones) + "1"
  }
}
