package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/min-cost-climbing-stairs/">
 *   Min Cost Climbing Stairs</a>
 */
class MinCostClimbingStairs {
  fun minCostClimbingStairs(cost: IntArray): Int {
    val n = cost.size
    val totalCost = IntArray(n).also {
      it[0] = cost[0]
      it[1] = cost[1]
    }

    for (i in 2 until n) {
      totalCost[i] = cost[i] + minOf(totalCost[i - 1], totalCost[i - 2])
    }

    return minOf(totalCost[n - 1], totalCost[n - 2])
  }
}
