package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/largest-3-same-digit-number-in-string/">
 *   Largest 3-Same-Digit Number in String</a>
 */
class Largest3SameDigitNumberInString {
  fun largestGoodInteger(num: String): String {
    var max = -1
    for (i in 0 until num.length - 2) {
      if (num[i] == num[i + 1] && num[i] == num[i + 2]) {
        max = maxOf(max, num[i].digitToInt())
      }
    }

    return if (max == -1) "" else "$max$max$max"
  }
}
