package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/relative-ranks/">Relative Ranks</a>
 */
class RelativeRanks {
  fun findRelativeRanks(score: IntArray): Array<String> {
    val queue = PriorityQueue<Pair<Int, Int>> { p1, p2 -> p2.first - p1.first }.apply {
      for (i in score.indices) {
        offer(score[i] to i)
      }
    }
    val result = MutableList(score.size) { "" }
    var place = 1

    while (queue.isNotEmpty()) {
      val (_, i) = queue.poll()

      result[i] = when (place) {
        1 -> "Gold Medal"
        2 -> "Silver Medal"
        3 -> "Bronze Medal"
        else -> place.toString()
      }

      place++
    }

    return result.toTypedArray()
  }
}
