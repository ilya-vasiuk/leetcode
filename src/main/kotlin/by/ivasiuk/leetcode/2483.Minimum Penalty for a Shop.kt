package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">Minimum Penalty for a Shop</a>
 */
class MinimumPenaltyForAShop {
  fun bestClosingTime(customers: String): Int {
    var profit = 0
    var earliestHour = 0
    var min = 0

    for (i in customers.indices) {
      if (customers[i] == 'Y') {
        profit++
      } else {
        profit--
      }

      if (profit > min) {
        min = profit
        earliestHour = i + 1
      }
    }

    return earliestHour
  }
}
