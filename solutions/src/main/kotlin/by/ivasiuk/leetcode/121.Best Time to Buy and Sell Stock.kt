package by.ivasiuk.leetcode

import kotlin.math.max

/**
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">
 *   Best Time to Buy and Sell Stock</a>
 */
class BestTimeToBuyAndSellStock {
  fun maxProfit(prices: IntArray): Int {
    var bestBuy = 0
    var maxProfit = 0
    var currentProfit: Int

    for (bestSell in 1 until prices.size) {
      currentProfit = prices[bestSell] - prices[bestBuy]
      if (prices[bestBuy] < prices[bestSell]) {
        maxProfit = max(currentProfit, maxProfit)
      } else {
        bestBuy = bestSell
      }
    }

    return maxProfit
  }
}