package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/maximum-subsequence-score/">
 *   Maximum Subsequence Score</a>
 */
class MaximumSubsequenceScore {
  fun maxScore(nums1: IntArray, nums2: IntArray, k: Int): Long {
    val pairs = Array(nums1.size) { i -> Pair(nums2[i].toLong(), nums1[i].toLong()) }
      .sortedWith(compareByDescending { it.first })
    val pq = PriorityQueue<Long>(k, compareBy { it })
    var res = 0L
    var totalSum = 0L

    pairs.forEach { (first, second) ->
      pq.add(second)
      totalSum += second

      if (pq.size > k) {
        totalSum -= pq.poll()
      }

      if (pq.size == k) {
        res = maxOf(res, totalSum * first)
      }
    }

    return res
  }
}
