package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.Node
import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/clone-graph/">Clone Graph</a>
 */
class CloneGraph {
  fun cloneGraph(node: Node?): Node? {
    if (node == null) {
      return null
    }

    val copy = Array<Node?>(100) { null }
    val queue = LinkedList<Node>()

    copy[node.`val`] = Node(node.`val`)
    queue.offer(node)

    while (queue.isNotEmpty()) {
      val current = queue.poll()

      for (next in current.neighbors) {
        if (copy[next!!.`val`] == null) {
          copy[next.`val`] = Node(next.`val`)
          queue.offer(next)
        }

        copy[current.`val`]!!.neighbors.add(copy[next.`val`])
      }
    }

    return copy[node.`val`]
  }
}
