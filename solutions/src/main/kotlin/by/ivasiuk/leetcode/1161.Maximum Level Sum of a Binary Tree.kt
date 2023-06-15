package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/">
 *   Maximum Level Sum of a Binary Tree</a>
 */
class MaximumLevelSumOfABinaryTree {
  fun maxLevelSum(root: TreeNode?): Int {
    var max = Int.MIN_VALUE
    var maxLevel = 0
    val queue = LinkedList<TreeNode>()
    queue.offer(root!!)
    var level = 1

    while (queue.isNotEmpty()) {
      var sum = 0
      repeat(queue.size) {
        queue.poll().let {
          sum += it.`val`
          it.left?.let { left -> queue.offer(left) }
          it.right?.let { right -> queue.offer(right) }
        }
      }

      if (sum > max) {
        max = sum
        maxLevel = level
      }

      level++
    }

    return maxLevel
  }
}
