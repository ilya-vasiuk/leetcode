package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/">
 *   Lowest Common Ancestor of a Binary Search Tree</a>
 */
class LowestCommonAncestorOfABinarySearchTree {
  fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? =
    if (p!!.`val` < root!!.`val` && q!!.`val` < root.`val`) {
      lowestCommonAncestor(root.left, p, q)
    } else if (p.`val` > root.`val` && q!!.`val` > root.`val`) {
      lowestCommonAncestor(root.right, p, q)
    } else {
      root
    }
}