package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/buy-two-chocolates/">
 *   Buy Two Chocolates</a>
 */
class BuyTwoChocolates {
  fun buyChoco(prices: IntArray, money: Int): Int {
    var min1 = Int.MAX_VALUE
    var min2 = Int.MAX_VALUE

    prices.forEach {
      if(it < min1) {
        min2 = min1
        min1 = it
      } else if (it < min2) {
        min2 = it
      }
    }

    return if (min1 + min2 > money) money else money - min1 - min2
  }
}
