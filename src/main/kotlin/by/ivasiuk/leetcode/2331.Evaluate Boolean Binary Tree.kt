package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/evaluate-boolean-binary-tree/">
 *   Evaluate Boolean Binary Tree</a>
 */
class EvaluateBooleanBinaryTree {
  fun evaluateTree(root: TreeNode?): Boolean =
    when (root!!.`val`) {
      0 -> false
      1 -> true
      2 -> evaluateTree(root.left) || evaluateTree(root.right)
      3 -> evaluateTree(root.left) && evaluateTree(root.right)
      else -> throw IllegalArgumentException("Unexpected symbol ${root.`val`}")
    }
}
