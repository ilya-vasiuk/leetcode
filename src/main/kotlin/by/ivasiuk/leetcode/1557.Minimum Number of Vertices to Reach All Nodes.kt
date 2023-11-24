package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/">
 *   Minimum Number of Vertices to Reach All Nodes</a>
 */
class MinimumNumberOfVerticesToReachAllNodes {
  fun findSmallestSetOfVertices(n: Int, edges: List<List<Int>>): List<Int> {
    val startVertices = BooleanArray(n) { true }

    edges.forEach { (_, to) -> startVertices[to] = false }

    return startVertices.indices.filter { startVertices[it] }
  }
}
