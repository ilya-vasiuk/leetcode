package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/largest-odd-number-in-string/">
 *   Largest Odd Number in String</a>
 */
class LargestOddNumberInString {
  fun largestOddNumber(num: String): String {
    var i = num.lastIndex

    while (i >= 0 && num[i] !in setOf('1', '3', '5', '7', '9')) {
      i--
    }

    return num.substring(0, i + 1)
  }
}
