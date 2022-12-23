package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/">
 *   Best Time to Buy and Sell Stock with Cooldown</a>
 */
class BestTimeToBuyAndSellStockWithCooldown {
  fun maxProfit(prices: IntArray): Int {
    val n = prices.size
    if (n == 0) {
      return 0
    }
    val dp = Array(n) { IntArray(3) }
    dp[0][1] = -prices[0]
    var minBuy = dp[0][1]

    for (i in 1 until n) {
      dp[i][0] = minBuy + prices[i]
      dp[i][1] = dp[i - 1][2] - prices[i]
      dp[i][2] = maxOf(dp[i - 1][2], dp[i - 1][0])
      minBuy = maxOf(minBuy, dp[i][1])
    }
    return maxOf(dp[n - 1][0], dp[n - 1][2])
  }
}
