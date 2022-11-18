package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/ugly-number/">
 *   Ugly Number</a>
 */
class UglyNumber {
  fun isUgly(n: Int): Boolean {
    var current = n

    intArrayOf(2, 3, 5).forEach {
      while (current > 1 && current % it == 0) current /= it
    }

    return current == 1
  }
}
