package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-ice-cream-bars/">
 *   Maximum Ice Cream Bars</a>
 */
class MaximumIceCreamBars {
  fun maxIceCream(costs: IntArray, coins: Int): Int {
    var total = 0

    costs.sorted().withIndex().forEach { (i, current) ->
      total = (total + current).takeIf { it <= coins } ?: return i
    }

    return costs.size
  }
}
