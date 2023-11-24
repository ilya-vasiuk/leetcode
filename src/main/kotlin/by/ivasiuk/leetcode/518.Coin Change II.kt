package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/coin-change-ii/">Coin Change II</a>
 */
class CoinChange2 {
  fun change(amount: Int, coins: IntArray): Int {
    val options = IntArray(amount + 1)
      .also { it[0] = 1 }

    for (i in coins) {
      for (j in i..amount) {
        options[j] += options[j - i]
      }
    }

    return options[amount]
  }
}
