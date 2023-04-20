package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/maximum-width-of-binary-tree/">
 *   Maximum Width of Binary Tree</a>
 */
class MaximumWidthOfBinaryTree {
  fun widthOfBinaryTree(root: TreeNode?): Int {
    var max = 0
    val queue = LinkedList<Pair<Int, TreeNode>>().apply {
      offer(Pair(0, root!!))
    }

    while (queue.isNotEmpty()) {
      max = maxOf(max, queue.peekLast().first - queue.peekFirst().first + 1)

      repeat(queue.size) {
        queue.pollFirst().let { (index, node) ->
          node.left?.let { queue.offer(Pair(2 * index, it)) }
          node.right?.let { queue.offer(Pair(2 * index + 1, it)) }
        }
      }
    }

    return max
  }
}
