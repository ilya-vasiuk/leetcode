package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-value-of-k-coins-from-piles/">
 *   Maximum Value of K Coins From Piles</a>
 */
class MaximumValueOfKCoinsFromPiles {
  fun maxValueOfCoins(piles: List<List<Int>>, k: Int): Int {
    val n = piles.size
    val maxCoins = Array(n + 1) { IntArray(k + 1) }

    for (i in 1..n) {
      for (coins in 0..k) {
        var currentSum = 0

        for (currentCoins in 0..minOf(piles[i - 1].size, coins)) {
          if (currentCoins > 0) {
            currentSum += piles[i - 1][currentCoins - 1]
          }

          maxCoins[i][coins] = maxOf(
            maxCoins[i][coins],
            maxCoins[i - 1][coins - currentCoins] + currentSum
          )
        }
      }
    }

    return maxCoins[n][k]
  }
}
