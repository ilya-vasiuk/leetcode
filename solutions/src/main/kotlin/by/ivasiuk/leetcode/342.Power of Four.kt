package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/power-of-four/">Power of Four</a>
 */
class PowerOfFour {
  fun isPowerOfFour(n: Int): Boolean {
    if (n < 1) {
      return false
    }

    var current = n
    while (current > 1) {
      if (current % 4 != 0) {
        return false
      }

      current /= 4
    }

    return true
  }
}
