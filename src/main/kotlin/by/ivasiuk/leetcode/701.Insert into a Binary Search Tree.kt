package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/insert-into-a-binary-search-tree/">
 *   Insert into a Binary Search Tree</a>
 */
class InsertIntoABinarySearchTree {
  fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode =
    root?.let {
      if (root.`val` > `val`) {
        root.left = insertIntoBST(root.left, `val`)
      } else {
        root.right = insertIntoBST(root.right, `val`)
      }

      root
    } ?: TreeNode(`val`)
}