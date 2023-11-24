package by.ivasiuk.leetcode

import java.util.*


/**
 * @see <a href="https://leetcode.com/problems/ipo/">IPO</a>
 */
class IPO {
  fun findMaximizedCapital(k: Int, w: Int, profits: IntArray, capital: IntArray): Int {
    val investments = profits.indices
      .map { Pair(profits[it], capital[it]) }
      .sortedBy { it.second }

    val priority = PriorityQueue<Int>(compareByDescending { it })
    var currentCapital = w
    var project = 0

    repeat(k) {
      while (project < investments.size && investments[project].second <= currentCapital) {
        priority.offer(investments[project++].first)
      }

      if (priority.isEmpty()) {
        return currentCapital
      }

      currentCapital += priority.poll()
    }

    return currentCapital
  }
}
