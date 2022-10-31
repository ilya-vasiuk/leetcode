package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/">
 *   Convert Sorted Array to Binary Search Tree</a>
 */
class ConvertSortedArrayToBinarySearchTree {
  fun sortedArrayToBST(nums: IntArray): TreeNode? =
    buildNode(nums, 0, nums.size - 1)

  private fun buildNode(nums: IntArray, left: Int, right: Int): TreeNode? =
    if (left > right) {
      null
    } else {
      val middle = (left + right) / 2

      TreeNode(nums[middle]).also {
        it.left = buildNode(nums, left, middle - 1)
        it.right = buildNode(nums, middle + 1, right)
      }
    }
}