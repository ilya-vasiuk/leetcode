package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/same-tree/">
 *   Same Tree</a>
 */
class SameTree {
  fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean =
    (p == null && q == null) ||
        (p?.`val` == q?.`val` && isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right))
}