package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-eventual-safe-states/">
 *   Find Eventual Safe States</a>
 */
class FindEventualSafeStates {
  fun eventualSafeNodes(graph: Array<IntArray>): List<Int> {
    val cycle = mutableSetOf<Int>()
    val safe = mutableSetOf<Int>()

    fun cycle(curr: Int): Boolean =
      if (safe.contains(curr)) {
        false
      } else {
        !cycle.add(curr) || graph[curr]
          .any { cycle(it) }
          .also {
            if (!it) {
              cycle.remove(curr)
              safe.add(curr)
            }
          }
      }

    return graph.indices.filter { !cycle(it) }
  }
}
