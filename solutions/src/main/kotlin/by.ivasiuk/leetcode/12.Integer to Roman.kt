package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/integer-to-roman/">
 *   Integer to Roman</a>
 */
class IntegerToRoman {
  fun intToRoman(num: Int): String =
    toRoman(num / 1000, "M", "V̅", "X̅") +
        toRoman(num % 1000 / 100, "C", "D", "M") +
        toRoman(num % 100 / 10, "X", "L", "C") +
        toRoman(num % 10, "I", "V", "X")

  private fun toRoman(n: Int, lowest: String, middle: String, highest: String): String =
    when (n) {
      0 -> ""
      1, 2, 3 -> lowest.repeat(n)
      4 -> lowest + middle
      5 -> middle
      6, 7, 8 -> middle + lowest.repeat(n - 5)
      9 -> lowest + highest
      else -> ""
    }
}