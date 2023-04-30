package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/remove-max-number-of-edges-to-keep-graph-fully-traversable/">
 *   Remove Max Number of Edges to Keep Graph Fully Traversable</a>
 */
class RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable {
  fun maxNumEdgesToRemove(n: Int, edges: Array<IntArray>): Int {
    val alice = UnionFind(n)
    val bob = UnionFind(n)

    return edges.sortedByDescending { it[0] }
      .map { (type, from, to) ->
        when (type) {
          1 -> alice.performUnion(from, to)
          2 -> bob.performUnion(from, to)
          else -> alice.performUnion(from, to) or bob.performUnion(from, to)
        }
      }
      .sum()
      .let { edges.size - it }
      .takeIf { alice.isConnected() && bob.isConnected() } ?: -1
  }


  private class UnionFind(var components: Int) {
    var representative = IntArray(components + 1) { it }
    var componentSize = IntArray(components + 1) { 1 }

    fun findRepresentative(x: Int): Int {
      if (representative[x] != x) {
        representative[x] = findRepresentative(representative[x])
      }

      return representative[x]
    }

    fun performUnion(from: Int, to: Int): Int {
      val x = findRepresentative(from)
      val y = findRepresentative(to)

      return when {
        x == y -> 0
        componentSize[x] > componentSize[y] -> {
          componentSize[x] += componentSize[y]
          representative[y] = x
          components--
          1
        }
        else -> {
          componentSize[y] += componentSize[x]
          representative[x] = y
          components--
          1
        }
      }
    }

    fun isConnected() = components == 1
  }
}
