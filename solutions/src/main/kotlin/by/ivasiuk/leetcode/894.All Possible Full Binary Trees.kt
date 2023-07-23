package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/all-possible-full-binary-trees/">
 *   All Possible Full Binary Trees</a>
 */
class AllPossibleFullBinaryTrees {
  fun allPossibleFBT(n: Int): List<TreeNode?> {
    if (n == 1) {
      return listOf(TreeNode(0))
    }

    val count = n - 1
    val res = mutableListOf<TreeNode>()

    for(i in 1 until count step 2) {
      for (left in allPossibleFBT(i)) {
        for (right in allPossibleFBT(count - i)) {
          res += TreeNode(0).apply {
            this.left = left
            this.right = right
          }
        }
      }
    }

    return res
  }
}
