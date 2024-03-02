package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/even-odd-tree/">Even Odd Tree</a>
 */
class EvenOddTree {
  fun isEvenOddTree(root: TreeNode?): Boolean {
    val queue = LinkedList<TreeNode>()
    queue.offer(root)
    var isOdd = false

    while (queue.isNotEmpty()) {
      var prev = if (isOdd) 1_000_001 else 0
      repeat(queue.size) {
        with(queue.pop()) {
          if ((`val` % 2 == 0) != isOdd || (isOdd && `val` >= prev) || (!isOdd && `val` <= prev)) {
            return false
          }

          left?.let { queue.offer(left) }
          right?.let { queue.offer(right) }
          prev = `val`
        }
      }

      isOdd = !isOdd
    }

    return true
  }
}
