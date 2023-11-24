package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-right-side-view/">
 *   Binary Tree Right Side View</a>
 */
class BinaryTreeRightSideView {
  fun rightSideView(root: TreeNode?): List<Int> {
    val result = mutableListOf<Int>()

    visit(root, result, 0)

    return result
  }

  private fun visit(node: TreeNode?, result: MutableList<Int>, depth: Int) {
    if (node != null) {
      if (depth == result.size) {
        result.add(node.`val`)
      } else {
        result[depth] = node.`val`
      }

      visit(node.left, result, depth + 1)
      visit(node.right, result, depth + 1)
    }
  }
}