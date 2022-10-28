package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/bus-routes/">
 *   Bus Routes</a>
 */
class BusRoutes {
  fun numBusesToDestination(routes: Array<IntArray>, source: Int, target: Int): Int {
    val visited: HashSet<Int> = HashSet()
    val q: Queue<Int> = LinkedList()
    val map: HashMap<Int, MutableList<Int>> = HashMap()
    var result = 0

    if (source == target) {
      return 0
    }

    for (i in routes.indices) {
      for (j in 0 until routes[i].size) {
        map.getOrPut(routes[i][j]) { mutableListOf() }.add(i)
      }
    }

    q.offer(source)
    while (q.isNotEmpty()) {
      val length = q.size
      result++

      for (i in 0 until length) {
        val current = q.poll()
        val buses = map[current]!!

        for (bus in buses) {
          if (visited.contains(bus)) {
            continue
          }

          visited.add(bus)

          for (j in 0 until routes[bus].size) {
            if (routes[bus][j] == target) {
              return result
            }

            q.offer(routes[bus][j])
          }
        }
      }
    }

    return -1
  }
}