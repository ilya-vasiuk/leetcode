package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/integer-break/">Integer Break</a>
 */
class IntegerBreak {
  fun integerBreak(n: Int): Int {
    if (n < 4) {
      return n - 1
    }

    var maxProduct = 1
    val threes = (n - 2) / 3

    for (i in 0 until (n - 2) / 3) {
      maxProduct *= 3
    }

    return maxProduct * (n - threes * 3)
  }
}