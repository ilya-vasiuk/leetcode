package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/">
 *   Minimum Flips to Make a OR b Equal to c</a>
 */
class MinimumFlipsToMakeAOrBEqualToC {
  fun minFlips(a: Int, b: Int, c: Int): Int {
    var num1 = a
    var num2 = b
    var num3 = c

    var result = 0

    while (num1 > 0 || num2 > 0 || num3 > 0) {
      val bitA = num1.and(1)
      val bitB = num2.and(1)
      val bitC = num3.and(1)

      result += when {
        bitA == 1 && bitB == 1 && bitC == 0 -> 2
        bitA == 0 && bitB == 0 && bitC == 1 -> 1
        (bitA == 1 || bitB == 1) && bitC == 0 -> 1
        else -> 0
      }

      num1 =  num1.shr(1)
      num2 =  num2.shr(1)
      num3 =  num3.shr(1)
    }

    return result
  }
}
