package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/find-largest-value-in-each-tree-row/">
 *   Find Largest Value in Each Tree Row</a>
 */
class FindLargestValueInEachTreeRow {
  fun largestValues(root: TreeNode?): List<Int> {
    val result = mutableListOf<Int>()

    fun visit(node: TreeNode?, depth: Int = 0) {
      node?.let {
        if (result.size == depth) {
          result.add(it.`val`)
        } else {
          result[depth] = maxOf(result[depth], it.`val`)
        }

        visit(node.left, depth + 1)
        visit(node.right, depth + 1)
      }
    }

    visit(root)

    return result
  }
}
