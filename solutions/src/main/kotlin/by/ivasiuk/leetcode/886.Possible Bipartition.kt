package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/possible-bipartition/">Possible Bipartition</a>
 */
class PossibleBipartition {
  fun possibleBipartition(n: Int, dislikes: Array<IntArray>): Boolean {
    val graph = Array(n + 1) { mutableListOf<Int>() }
    val colors = IntArray(n + 1)

    dislikes.forEach {
      graph[it[0]].add(it[1])
      graph[it[1]].add(it[0])
    }

    for (i in 1..n) {
      if (colors[i] == 0 && !check(graph, colors, i, 1)) {
        return false
      }
    }

    return true
  }

  private fun check(
    graph: Array<MutableList<Int>>,
    colors: IntArray,
    current: Int,
    color: Int
  ): Boolean {
    colors[current] = color

    for (neighbor in graph[current]) {
      if (colors[neighbor] == color ||
        colors[neighbor] == 0 &&
        !check(graph, colors, neighbor, color * -1)
      ) {
        return false
      }
    }

    return true
  }
}
