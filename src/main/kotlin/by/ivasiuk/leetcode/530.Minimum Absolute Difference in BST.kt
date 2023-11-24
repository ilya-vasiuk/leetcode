package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.math.abs

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
class MinimumAbsoluteDifferenceInBST {
  fun getMinimumDifference(root: TreeNode?): Int {
    var minDiff = Int.MAX_VALUE
    var prev = Int.MAX_VALUE

    fun check(node: TreeNode?) {
      node?.let {
        check(it.left)

        if (prev != Int.MAX_VALUE) {
          minDiff = minOf(minDiff, abs(prev - it.`val`))
        }

        prev = it.`val`
        check(it.right)
      }
    }

    check(root)
    return minDiff
  }
}
