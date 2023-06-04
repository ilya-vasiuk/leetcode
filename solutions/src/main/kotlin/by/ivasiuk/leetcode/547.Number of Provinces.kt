package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/number-of-provinces/">
 *   Number of Provinces</a>
 */
class NumberOfProvinces {
  fun findCircleNum(isConnected: Array<IntArray>): Int {
    val visited = BooleanArray(isConnected.size)
    val queue = LinkedList<Int>()
    var provinces = 0

    for (i in isConnected.indices) {
      if (!visited[i]) {
        queue.offer(i)
        visited[i] = true

        while (queue.isNotEmpty()) {
          val current = queue.poll()
          visited[current] = true

          for (neighbour in isConnected.indices) {
            if (isConnected[current][neighbour] == 1 && !visited[neighbour]) {
              queue.offer(neighbour)
              visited[neighbour] = true
            }
          }
        }

        provinces++
      }
    }

    return provinces
  }
}