package by.ivasiuk.leetcode

import java.util.*


/**
 * @see <a href="https://leetcode.com/problems/find-closest-node-to-given-two-nodes/">
 *   Find Closest Node to Given Two Nodes</a>
 */
class FindClosestNodeToGivenTwoNodes {
  fun closestMeetingNode(edges: IntArray, node1: Int, node2: Int): Int {
    val n = edges.size
    val a = IntArray(n) { Int.MAX_VALUE }
    val b = IntArray(n) { Int.MAX_VALUE }

    check(node1, a, edges)
    check(node2, b, edges)

    var res = Int.MAX_VALUE
    var node = -1

    for (i in 0 until n) {
      if (a[i] != Int.MAX_VALUE && b[i] != Int.MAX_VALUE) {
        if (res > maxOf(a[i], b[i])) {
          node = i
          res = maxOf(a[i], b[i])
        }
      }
    }

    return node
  }

  private fun check(src: Int, dist: IntArray, edge: IntArray) {
    val q: Queue<Int> = LinkedList()
    q.offer(src)
    dist[src] = 0

    while (q.isNotEmpty()) {
      val p = q.poll()

      if (edge[p] != -1 && dist[edge[p]] == Int.MAX_VALUE) {
        q.offer(edge[p])
        dist[edge[p]] = dist[p] + 1
      }
    }
  }
}
