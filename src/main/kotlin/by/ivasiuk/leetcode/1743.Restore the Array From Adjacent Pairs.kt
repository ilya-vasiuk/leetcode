package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/restore-the-array-from-adjacent-pairs/">
 *   Restore the Array From Adjacent Pairs</a>
 */
class RestoreTheArrayFromAdjacentPairs {
  fun restoreArray(adjacentPairs: Array<IntArray>): IntArray {
    val visited = HashSet<Int>()
    val graph = mutableMapOf<Int, MutableList<Int>>().apply {
      adjacentPairs.forEach { (from, to) ->
        getOrPut(from) { mutableListOf() } += to
        getOrPut(to) { mutableListOf() } += from
      }
    }

    with(ArrayDeque<Int>()) {
      add(graph.keys.first { graph[it]!!.size == 1 })

      return IntArray(adjacentPairs.size + 1) {
        while (visited.contains(first())) {
          removeFirst()
        }

        val current = removeFirst()

        visited.add(current)
        graph[current]?.let { addAll(it) }

        current
      }
    }
  }
}
