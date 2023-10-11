package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Number of Flowers in Full Bloom</a>
 */
class NumberOfFlowersInFullBloom {
  fun fullBloomFlowers(flowers: Array<IntArray>, people: IntArray): IntArray =
    with (PriorityQueue<Triple<Int, Int, Int>>(compareBy({ it.first }, { it.second }))) {
      flowers.forEach { (from, to) ->
        offer(Triple(from, 0, -1))
        offer(Triple(to, 2, -1))
      }

      people.indices.forEach { i ->
        offer(Triple(people[i], 1, i))
      }

      val result = IntArray(people.size)
      var bloom = 0

      while (isNotEmpty()) {
        val (_, identification, index) = poll()

        when (identification) {
          0 -> bloom++
          1 -> result[index] = bloom
          else -> bloom--
        }
      }

      return result
    }
}
