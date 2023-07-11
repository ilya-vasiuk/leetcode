package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import java.util.*
import kotlin.collections.HashSet

/**
 * @see <a href="https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/">
 *   All Nodes Distance K in Binary Tree</a>
 */
class AllNodesDistanceKInBinaryTree {
  fun distanceK(root: TreeNode?, target: TreeNode?, k: Int): List<Int> {
    val fromTo = mutableMapOf<Int, MutableList<Int>>()
    val visited = HashSet<Int>()

    fun visit(node: TreeNode?, parent: TreeNode?) {
      node?.let { from ->
        parent?.let { to ->
          fromTo.computeIfAbsent(from.`val`) { mutableListOf() }.add(to.`val`)
          fromTo.computeIfAbsent(to.`val`) { mutableListOf() }.add(from.`val`)
        }

        visit(from.left, from)
        visit(from.right, from)
      }
    }

    visit(root, null)

    return LinkedList<Int>().apply {
      target?.let {
        add(it.`val`)
        visited.add(it.`val`)
      }

      repeat(k) {
        repeat(size) {
          fromTo.remove(poll())
            ?.forEach { if (visited.add(it)) add(it) }
        }
      }
    }
  }
}
