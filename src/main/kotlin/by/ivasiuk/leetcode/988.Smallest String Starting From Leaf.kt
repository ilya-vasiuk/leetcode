package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/smallest-string-starting-from-leaf/">
 *   Smallest String Starting From Leaf</a>
 */
class SmallestStringStartingFromLeaf {
  fun smallestFromLeaf(root: TreeNode?, current: String = ""): String =
    when {
      root!!.left != null && root.right != null -> minOf(
        smallestFromLeaf(root.left, ('a' + root.`val`) + current),
        smallestFromLeaf(root.right, ('a' + root.`val`) + current)
      )
      root.left != null -> smallestFromLeaf(root.left, ('a' + root.`val`) + current)
      root.right != null -> smallestFromLeaf(root.right, ('a' + root.`val`) + current)
      else -> ('a' + root.`val`) + current
    }
}
