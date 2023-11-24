package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/search-in-a-binary-search-tree/">
 *   Search in a Binary Search Tree</a>
 */
class SearchInABinarySearchTree {
  fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
    return root?.let {
      if (it.`val` == `val`) {
        it
      } else if (it.`val` < `val`) {
        searchBST(it.right, `val`)
      } else {
        searchBST(it.left, `val`)
      }
    }
  }
}