package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/number-of-provinces/">
 *   Number of Provinces</a>
 */
class NumberOfProvinces {
  fun findCircleNum(isConnected: Array<IntArray>): Int {
    val visited = mutableSetOf<Int>()
    var provinces = 0

    for (i in isConnected.indices) {
      if (!visited.contains(i)) {
        visit(i, isConnected, visited)
        provinces++
      }
    }

    return provinces
  }

  private fun visit(city: Int, isConnected: Array<IntArray>, visited: MutableSet<Int>) {
    val queue = LinkedList<Int>()
    queue.add(city)

    while (queue.isNotEmpty()) {
      val current = queue.pop()
      visited.add(current)

      for (neighbour in isConnected.indices) {
        if (isConnected[current][neighbour] == 1 && !visited.contains(neighbour)) {
          queue.add(neighbour)
        }
      }
    }
  }
}