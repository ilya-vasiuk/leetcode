package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/find-mode-in-binary-search-tree/">
 *   Find Mode in Binary Search Tree
 * </a>
 */
class FindModeInBinarySearchTree {
  fun findMode(root: TreeNode?): IntArray {
    val result = mutableListOf<Int>()
    var max = 0
    var count = 0
    var prev = Int.MAX_VALUE

    fun visit(n: TreeNode) {
      n.left?.let { visit(it) }

      if (prev == n.`val`) {
        count++
      } else {
        count = 1
        prev = n.`val`
      }

      if (count == max) {
        result += n.`val`
      } else if (count > max) {
        max = count
        result.clear()
        result += n.`val`
      }

      n.right?.let { visit(it) }
    }

    root?.let { visit(it) }

    return result.toIntArray()
  }
}
