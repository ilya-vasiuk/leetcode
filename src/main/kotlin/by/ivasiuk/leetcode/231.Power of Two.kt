package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/power-of-two/">Power of Two</a>
 */
class PowerOfTwo {
  fun isPowerOfTwo(n: Int): Boolean = POW_OF_TWO_REGEX.matches(n.toString(2))

  companion object {
    val POW_OF_TWO_REGEX = Regex("10*")
  }
}
