package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/">
 *   Reorder Routes to Make All Paths Lead to the City Zero</a>
 */
class ReorderRoutesToMakeAllPathsLeadToTheCityZero {
  fun minReorder(n: Int, connections: Array<IntArray>): Int {
    val graph = mutableMapOf<Int, MutableList<Pair<Int, Int>>>().apply {
      connections.forEach { (from, to) ->
        computeIfAbsent(from) { mutableListOf() }.add(Pair(to, 1))
        computeIfAbsent(to) { mutableListOf() }.add(Pair(from, 0))
      }
    }
    val queue = LinkedList<Pair<Int, Int>>().apply { offer(Pair(0, 0)) }
    var result = 0

    while (queue.isNotEmpty()) {
      val (current, parent) = queue.poll()

      graph[current]!!.forEach {
        if (it.first != parent) {
          queue.offer(Pair(it.first, current))
          result += it.second
        }
      }
    }

    return result
  }
}
