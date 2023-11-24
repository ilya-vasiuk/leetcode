package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/greatest-common-divisor-of-strings/">
 *   Greatest Common Divisor of Strings</a>
 */
class GreatestCommonDivisorOfStrings {
  fun gcdOfStrings(str1: String, str2: String): String =
    if (str1 + str2 == str2 + str1) str1.substring(0, gcd(str1.length, str2.length)) else ""

  private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a.rem(b))
}