package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/find-k-pairs-with-smallest-sums/">
 *   Find K Pairs with Smallest Sums</a>
 */
class FindKPairsWithSmallestSums {
  fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    val queue = PriorityQueue<Pair<Int, Int>>(compareBy { nums1[it.first] + nums2[it.second] })
      .apply { offer(Pair(0, 0)) }

    while (result.size < k && queue.isNotEmpty()) {
      val (index1, index2) = queue.poll()

      result.add(listOf(nums1[index1], nums2[index2]))

      if (index2 + 1 < nums2.size) {
        queue.offer(Pair(index1, index2 + 1))
      }

      if (index2 == 0 && index1 + 1 < nums1.size) {
        queue.offer(Pair(index1 + 1, 0))
      }
    }

    return result
  }
}
