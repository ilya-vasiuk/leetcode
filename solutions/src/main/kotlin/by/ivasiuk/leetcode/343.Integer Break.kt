package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/integer-break/">Integer Break</a>
 */
class IntegerBreak {
  fun integerBreak(n: Int): Int {
    if (n < 4) {
      return n - 1
    }

    val threes = (n - 2) / 3
    val maxProduct = (0 until threes).fold(1) { acc, _ -> acc * 3 }

    return maxProduct * (n - threes * 3)
  }
}
