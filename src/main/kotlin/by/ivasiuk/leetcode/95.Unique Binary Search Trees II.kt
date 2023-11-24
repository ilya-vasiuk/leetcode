package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/unique-binary-search-trees-ii/">
 *   Unique Binary Search Trees II</a>
 */
class UniqueBinarySearchTrees2 {
  fun generateTrees(n: Int): List<TreeNode?> = dfs(1, n)

  private fun dfs(min: Int, max: Int): List<TreeNode> =
    when {
      min > max -> listOf()
      min == max -> listOf(TreeNode(min))
      else -> {
        val trees = ArrayList<TreeNode>()
        for (root in min..max) {
          val lefts = dfs(min, root - 1).takeUnless { it.isEmpty() } ?: listOf(null)
          val rights = dfs(root + 1, max).takeUnless { it.isEmpty() } ?: listOf(null)

          for (left in lefts) {
            for (right in rights) {
              trees.add(TreeNode(root).also {
                it.left = left
                it.right = right
              })
            }
          }
        }

        trees
      }
    }
}
