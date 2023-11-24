package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/minimum-score-of-a-path-between-two-cities/">
 *   Minimum Score of a Path Between Two Cities</a>
 */
class MinimumScoreOfAPathBetweenTwoCities {
  fun minScore(n: Int, roads: Array<IntArray>): Int {
    var min = Int.MAX_VALUE
    val visited = BooleanArray(n + 1)
    val queue = LinkedList<Int>().apply { offer(1) }

    val graph = mutableMapOf<Int,  MutableMap<Int, Int>>()
    roads.forEach { (from, to, score) ->
      graph.computeIfAbsent(from) { mutableMapOf() }[to] = score
      graph.computeIfAbsent(to) { mutableMapOf() }[from] = score
    }


    while (queue.isNotEmpty()) {
      val current = queue.poll()

      graph[current]!!.forEach { (next, score) ->
        if (!visited[next]) {
          queue.offer(next)
          visited[next] = true
        }

        min = minOf(min, score)
      }
    }

    return min
  }
}
