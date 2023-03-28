package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-cost-for-tickets/">
 *   Minimum Cost For Tickets</a>
 */
class MinimumCostForTickets {
  fun mincostTickets(days: IntArray, costs: IntArray): Int {
    val minCost = IntArray(days.last() + 1)
    var travelDay = 0

    for (day in 1..days.last()) {
      if (day == days[travelDay]) {
        travelDay++
        minCost[day] = minOf(
          costs[0] + minCost[day - 1],
          costs[1] + minCost[maxOf(0, day - 7)],
          costs[2] + minCost[maxOf(0, day - 30)]
        )
      } else {
        minCost[day] = minCost[day - 1]
      }
    }

    return minCost.last()
  }
}
