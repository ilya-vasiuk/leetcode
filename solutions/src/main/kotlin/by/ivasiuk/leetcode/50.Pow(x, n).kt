package by.ivasiuk.leetcode

import kotlin.math.abs

/**
 * @see <a href="https://leetcode.com/problems/powx-n/">
 *   Pow(x, n)</a>
 */
class Pow {
  fun myPow(x: Double, n: Int): Double {
    val num = if (n < 0) 1 / x else x
    var power = abs(n.toLong())
    var product = num
    var result = 1.0

    while (power > 0) {
      if (power % 2 == 1L) {
        result *= product
      }

      power /= 2
      product *= product
    }

    return result
  }
}
