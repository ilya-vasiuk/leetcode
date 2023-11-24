package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/">
 *   Best Time to Buy and Sell Stock with Transaction Fee</a>
 */
class BestTimeToBuyAndSellStockWithTransactionFee {
  fun maxProfit(prices: IntArray, fee: Int): Int {
    var buy = Int.MIN_VALUE
    var sell = 0

    for (price in prices) {
      buy = maxOf(buy, sell - price)
      sell = maxOf(sell, price + buy - fee)
    }

    return sell
  }
}
