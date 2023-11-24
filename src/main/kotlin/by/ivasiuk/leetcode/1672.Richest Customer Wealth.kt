package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/richest-customer-wealth/">
 *   Richest Customer Wealth</a>
 */
class RichestCustomerWealth {
  fun maximumWealth(accounts: Array<IntArray>): Int{
    var max = 0

    accounts.forEach { max = maxOf(it.sum(), max) }

    return max
  }
}
