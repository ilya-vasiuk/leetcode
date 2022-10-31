package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/two-sum-iv-input-is-a-bst/">
 *   Two Sum IV - Input is a BST</a>
 */
class TwoSum4InputIsABst {
  private val visited = mutableSetOf<Int>()

  fun findTarget(root: TreeNode?, k: Int): Boolean =
    root?.let {
      if (visited.contains(k - root.`val`)) {
        true
      } else {
        visited.add(root.`val`)
        findTarget(root.left, k) || findTarget(root.right, k)
      }
    } ?: false
}