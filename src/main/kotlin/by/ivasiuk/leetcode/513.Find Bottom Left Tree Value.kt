package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/find-bottom-left-tree-value/">
 *   Find Bottom Left Tree Value</a>
 */
class FindBottomLeftTreeValue {
  fun findBottomLeftValue(root: TreeNode?): Int {
    if (root == null) {
      return -1
    }

    with(LinkedList<TreeNode>()) {
      offer(root)

      var res = root

      while (isNotEmpty()) {
        res = poll()

        res.right?.let { offer(it) }
        res.left?.let { offer(it) }
      }

      return res!!.`val`
    }
  }
}
