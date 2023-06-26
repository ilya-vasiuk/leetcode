package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/total-cost-to-hire-k-workers/">
 *   Total Cost to Hire K Workers</a>
 */
class TotalCostToHireKWorkers {
  fun totalCost(costs: IntArray, k: Int, candidates: Int): Long {
    val leftCandidates = PriorityQueue<Int>()
    val rightCandidates = PriorityQueue<Int>()

    var left = 0
    var right = costs.lastIndex
    var res = 0L

    repeat(k) {
      while (leftCandidates.size < candidates && left <= right) {
        leftCandidates.add(costs[left++])
      }

      while (rightCandidates.size < candidates && left <= right) {
        rightCandidates.add(costs[right--])
      }

      res += if ((leftCandidates.peek() ?: 100_001) <= (rightCandidates.peek() ?: 100_001)) {
        leftCandidates.poll()
      } else {
        rightCandidates.poll()
      }
    }

    return res
  }
}
