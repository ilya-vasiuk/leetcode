package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/kth-smallest-element-in-a-bst/">
 *   Kth Smallest Element in a BST</a>
 */
class KthSmallestElementInABst {
  fun kthSmallest(root: TreeNode?, k: Int): Int =
    findKthSmallest(root!!, Counter(0), k)

  private fun findKthSmallest(node: TreeNode, counter: Counter, k: Int): Int {
    var number = -1
    node.left?.let { left ->
      number = findKthSmallest(left, counter, k)
    }
    counter.tick()

    if (counter.i == k) {
      return node.`val`
    }

    if (number == -1) {
      node.right?.let { right ->
        number = findKthSmallest(right, counter, k)
      }
    }

    return number
  }


  data class Counter(
    var i: Int
  ) {
    fun tick(): Counter {
      i++
      return this
    }
  }
}