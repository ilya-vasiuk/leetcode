package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/top-k-frequent-elements/">
 *   Top K Frequent Elements</a>
 */
class TopKFrequentElements {
  fun topKFrequent(nums: IntArray, k: Int): IntArray =
    with(PriorityQueue<Pair<Int, Int>>(compareBy { it.first })) {
      val map = mutableMapOf<Int, Int>().also {
        nums.forEach { num ->
          it[num] = it.getOrDefault(num, 0) + 1
        }
      }

      map.forEach { (num, freq) ->
        offer(Pair(freq, num))
        if (size > k) poll()
      }

      this.map { it.second }.toIntArray()
    }
}
