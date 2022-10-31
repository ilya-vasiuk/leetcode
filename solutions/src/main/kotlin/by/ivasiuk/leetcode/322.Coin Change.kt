package by.ivasiuk.leetcode

import kotlin.math.min

/**
 * @see <a href="https://leetcode.com/problems/coin-change/">
 *   Coin Change</a>
 */
class CoinChange {
  fun coinChange(coins: IntArray, amount: Int): Int {
    val combo = IntArray(amount + 1) { 0 }
    coins.sort()

    for (i in 1 until amount + 1) {
      combo[i] = Int.MAX_VALUE
      for (coin in coins) {
        if (i - coin < 0) break

        if (combo[i - coin] != Int.MAX_VALUE) {
          combo[i] = min(combo[i], combo[i - coin] + 1)
        }
      }
    }

    return if (combo[amount] == Int.MAX_VALUE) -1 else combo[amount]
  }
}