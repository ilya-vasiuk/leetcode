package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/check-completeness-of-a-binary-tree/">
 *   Check Completeness of a Binary Tree</a>
 */
class CheckCompletenessOfABinaryTree {
  fun isCompleteTree(root: TreeNode?): Boolean {
    val queue = LinkedList<TreeNode?>().apply { add(root) }
    var haveNullNode = false

    while (queue.isNotEmpty()) {
      repeat(queue.size) {
        val current = queue.poll()

        if (current == null) {
          haveNullNode = true
        } else {
          if (haveNullNode) {
            return false
          }

          queue.add(current.left)
          queue.add(current.right)
        }
      }
    }

    return true
  }
}
