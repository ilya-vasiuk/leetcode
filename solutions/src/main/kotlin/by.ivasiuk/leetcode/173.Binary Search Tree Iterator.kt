package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/binary-search-tree-iterator/">
 *   Binary Search Tree Iterator</a>
 */
class BSTIterator(root: TreeNode?) {
  private var memo = Stack<TreeNode?>()

  init {
    var node = root
    while (node != null) {
      memo.push(node)
      node = node.left
    }
  }

  fun next(): Int =
    memo.pop()!!.also { updateMemo(it) }.`val`

  fun hasNext(): Boolean = memo.isNotEmpty()

  private fun updateMemo(node: TreeNode) {
    var current: TreeNode? = node

    if (current?.right != null) {
      current = current.right

      while (current != null) {
        memo.push(current)
        current = current.left
      }
    }
  }
}