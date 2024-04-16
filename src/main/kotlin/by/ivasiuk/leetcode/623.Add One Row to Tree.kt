package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/add-one-row-to-tree/">
 *   Add One Row to Tree</a>
 */
class AddOneRowToTree {
  fun addOneRow(root: TreeNode?, `val`: Int, depth: Int, current:  Int = 1): TreeNode? {
    if (depth == 1) {
      return TreeNode(`val`).apply { left = root }
    }

    if (root != null) {
      if (current == depth - 1) {
        root.left = TreeNode(`val`).apply { left = root.left }
        root.right = TreeNode(`val`).apply { right = root.right }
      } else {
        addOneRow(root.left, `val`, depth, current + 1)
        addOneRow(root.right, `val`, depth, current + 1)
      }
    }

    return root
  }
}
