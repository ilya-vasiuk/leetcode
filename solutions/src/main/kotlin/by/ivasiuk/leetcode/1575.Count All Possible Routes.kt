package by.ivasiuk.leetcode

import kotlin.math.abs

/**
 * @see <a href="https://leetcode.com/problems/count-all-possible-routes/">
 *   Count All Possible Routes</a>
 */
class CountAllPossibleRoutes {
  fun countRoutes(locations: IntArray, start: Int, finish: Int, fuel: Int): Int {
    val cache = mutableMapOf<Pair<Int, Int>, Int>()

    fun visit(curr: Int, f: Int): Int {
      if (f < 0) {
        return 0
      }

      return cache.getOrPut(curr to f) {
        var sum = if (curr == finish) 1 else 0

        locations.forEachIndexed { i, n ->
          if (i != curr) {
            sum = (sum + visit(i, f - abs(n - locations[curr]))) % MODULO
          }
        }

        sum
      }
    }

    return visit(start, fuel)
  }

  companion object {
    const val MODULO = 1_000_000_007
  }
}
