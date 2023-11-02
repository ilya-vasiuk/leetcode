package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/">
 *   Count Nodes Equal to Average of Subtree</a>
 */
class CountNodesEqualToAverageOfSubtree {
  fun averageOfSubtree(root: TreeNode?): Int {
    var count = 0

    fun calcAvg(root: TreeNode?): Pair<Int, Int> {
      if (root == null) {
        return 0 to 0
      }

      val left = calcAvg(root.left)
      val right = calcAvg(root.right)

      val sum = left.first + right.first + root.`val`
      val num = left.second + right.second + 1

      if (sum / num == root.`val`) {
        count++
      }

      return sum to num
    }

    calcAvg(root)

    return count
  }
}
