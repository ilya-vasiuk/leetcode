package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/evaluate-division/">Evaluate Division</a>
 */
class EvaluateDivision {
  fun calcEquation(equations: List<List<String>>, values: DoubleArray, queries: List<List<String>>): DoubleArray {
    val map = mutableMapOf<String, MutableMap<String, Double>>()

    equations.forEachIndexed { index, (from, to) ->
      map.computeIfAbsent(from) { mutableMapOf() }[to] = values[index]
      map.computeIfAbsent(to) { mutableMapOf() }[from] = 1 / values[index]
    }

    fun visit(
      from: String,
      target: String,
      visited: MutableSet<String>
    ): Double {
      if (from == target) {
        return 1.0
      }

      map[from]?.forEach { (to, diff) ->
        if (!visited.contains(to)) {
          visited.add(to)

          val result = visit(to, target, visited)
          if (result >= 0) {
            return diff * result
          }
        }
      }

      return -1.0
    }

    val result = DoubleArray(queries.size) { -1.0 }

    queries.forEachIndexed { i, (from, target) ->
      if (map.containsKey(from) && map.containsKey(target)) {
        result[i] = visit(from, target, mutableSetOf())
      }
    }

    return result
  }
}
