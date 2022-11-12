package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/most-profitable-path-in-a-tree/">
 *   Most Profitable Path in a Tree</a>
 */
//TODO: finish one day for fun sake
class MostProfitablePathInATree {
  fun mostProfitablePath(edges: Array<IntArray>, bob: Int, amount: IntArray): Int {
    val n = amount.size

    val bobPath = findBob(edges, bob, n)

//    return optimalWay(map, 0, 0, visited, bobPath, amount)
    return 0
  }

  private fun optimalWay(
    map: Array<BooleanArray>,
    current: Int,
    step: Int,
    visited: BooleanArray,
    bobPath: MutableMap<Int, Int>,
    amount: IntArray
  ): Int {
    var sum = amount[current]

    if (bobPath.containsKey(current)) {
      if (bobPath[current]!! < step) {
        sum -= amount[current]
      } else if (bobPath[current]!! == step) {
        sum -= amount[current] / 2
      }
    }

    visited[current] = true

    var max = Int.MIN_VALUE
    map[current].indices
    for (i in map[current].indices) {
      if (map[current][i] && !visited[i]) {
        max = maxOf(max, optimalWay(map, i, step + 1, visited, bobPath, amount))
      }
    }

    return if (max == Int.MIN_VALUE) sum else sum + max
  }

  private fun findBob(edges: Array<IntArray>, bob: Int, n: Int): Map<Int, Int> {
    val result = LinkedList<Pair<Int, Int>>()
    val visited = BooleanArray(n)

    val queue = LinkedList<Pair<Int, Int>>()
    queue.push(Pair(0, bob))

    while (queue.isNotEmpty()) {
      val (step, current) = queue.pop()

      result.push(Pair(step, current))
      visited[current] = true

      if(current == 0) {
        break
      }

      val options = edges.filter {
        it[0] == current && !visited[it[1]] ||
        it[1] == current && !visited[it[0]]
      }

      if (options.isEmpty()) {
        result.pop()
      }

      options.forEach { queue.push(Pair(step + 1, if (it[0] == current) it[1] else it[0])) }
    }

    return result.associate { it }
  }
}
