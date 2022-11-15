package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import java.math.BigInteger

/**
 * @see <a href="https://leetcode.com/problems/count-complete-tree-nodes/">
 *   Count Complete Tree Nodes</a>
 */
class CountCompleteTreeNodes {
  private var height: Int? = null

  fun countNodes(root: TreeNode?): Int =
    root?.let { check(it, 1, 0) } ?: 0

  private fun check(node: TreeNode, current: Long, level: Int): Int? {
    var result: Int? = null

    if (node.right != null) {
      result = check(node.right!!, current * 2 + 1, level + 1)
    }

    if (result == null) {
      if (height == null) {
        height = level
      }

      if (node.left != null) {
        result = if (node.right == null) {
          current.toInt() * 2
        } else {
          check(node.left!!, current * 2, level + 1)
        }
      } else if (current == 2L.pow(height!!)) {
        result = (2L.pow(level + 1) - 1).toInt()
      } else if (level > height!!) {
        result = current.toInt()
      }
    }

    return result
  }

  private fun Long.pow(n: Int) = BigInteger.valueOf(this).pow(n).toLong()
}
