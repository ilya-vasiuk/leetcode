package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/all-paths-from-source-to-target/">
 *    All Paths From Source to Target</a>
 */
class AllPathsFromSourceToTarget {
  fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
    val resultSet = mutableListOf<List<Int>>()

    visit(graph, 0, listOf(), resultSet)

    return resultSet
  }

  private fun visit(
    graph: Array<IntArray>,
    current: Int,
    currentPath: List<Int>,
    resultSet: MutableList<List<Int>>
  ) {
    for (i in graph[current]) {
      if (i == graph.size - 1) {
        resultSet.add(currentPath + current + i)
      } else {
        visit(graph, i, currentPath + current, resultSet)
      }
    }
  }
}