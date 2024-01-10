package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
class AmountOfTimeForBinaryTreeToBeInfected {
  fun amountOfTime(root: TreeNode?, start: Int): Int {
    val graph = mutableMapOf<TreeNode, MutableList<TreeNode>>()
    val queue = ArrayDeque<TreeNode>()
    val visited = mutableSetOf<TreeNode>()

    fun visit(node: TreeNode): Unit = with (node) {
      if (`val` == start) {
        queue.add(node)
        visited.add(node)
      }
      left?.let {
        graph.getOrPut(node) { mutableListOf() } += it
        graph.getOrPut(it) { mutableListOf() } += node
        visit(it)
      }
      right?.let {
        graph.getOrPut(node) { mutableListOf() } += it
        graph.getOrPut(it) { mutableListOf() } += node
        visit(it)
      }
    }

    root?.let { visit(it) }

    var time = -1
    while (queue.isNotEmpty()) {
      repeat(queue.size) {
        val current = queue.removeFirst()

        graph[current]?.onEach {
          if (visited.add(it)) {
            queue.add(it)
          }
        }
      }

      time++
    }

    return time
  }
}
