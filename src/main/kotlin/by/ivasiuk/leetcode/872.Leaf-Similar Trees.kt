package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import java.util.LinkedList
import java.util.Queue

/**
 * @see <a href="https://leetcode.com/problems/leaf-similar-trees/">
 *  Leaf-Similar Trees</a>
 */
class LeafSimilarTrees {
  fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
    val leaves = LinkedList<Int>()

    visit(root1, leaves)

    return check(root2, leaves) && leaves.isEmpty()
  }

  private fun visit(node: TreeNode?, leaves: Queue<Int>) {
    node?.let {
      if (it.left == null && it.right == null) {
        leaves.offer(it.`val`)
      } else {
        visit(it.left, leaves)
        visit(it.right, leaves)
      }
    }
  }

  private fun check(node: TreeNode?, leaves: Queue<Int>): Boolean =
    node?.let {
      if (it.left == null && it.right == null) {
        leaves.isNotEmpty() && leaves.poll() == it.`val`
      } else {
        check(it.left, leaves) && check(it.right, leaves)
      }
    } ?: true
}
