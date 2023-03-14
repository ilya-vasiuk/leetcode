package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/sum-root-to-leaf-numbers/">
 *   Sum Root to Leaf Numbers</a>
 */
class SumRootToLeafNumbers {
  fun sumNumbers(root: TreeNode?, current: Int = 0): Int =
    root?.let {
      val temp = current * 10 + it.`val`

      if (it.left == null && it.right == null) {
        temp
      } else {
        (it.left?.let { left -> sumNumbers(left, temp) } ?: 0) +
            (it.right?.let { right -> sumNumbers(right, temp) } ?: 0)
      }
    } ?: current
}
