package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/bus-routes/">
 *   Bus Routes</a>
 */
class BusRoutes {
  fun numBusesToDestination(routes: Array<IntArray>, source: Int, target: Int): Int {
    if (source == target) {
      return 0
    }

    val visited = mutableSetOf<Int>()
    val map = mutableMapOf<Int, MutableList<Int>>()
    var result = 0

    for (i in routes.indices) {
      for (j in routes[i].indices) {
        map.getOrPut(routes[i][j]) { mutableListOf() } += i
      }
    }

    with(LinkedList<Int>()) {
      offer(source)

      while (isNotEmpty()) {
        val length = size
        result++

        for (i in 0 until length) {
          val current = poll()

          map[current]!!.forEach { bus ->
            if (!visited.contains(bus)) {

              visited.add(bus)

              for (j in routes[bus].indices) {
                if (routes[bus][j] == target) {
                  return result
                }

                offer(routes[bus][j])
              }
            }
          }
        }
      }
    }

    return -1
  }
}
