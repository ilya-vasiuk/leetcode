package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.math.abs

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
class MinimumDistanceBetweenBSTNodes {
  fun minDiffInBST(root: TreeNode?): Int {
    val values = mutableSetOf<Int>()

    inspect(root, values)

    val sorted = values.sorted()
    var min = Int.MAX_VALUE
    for (i in 1 until sorted.size) {
      min = minOf(min, abs(sorted[i] - sorted[i - 1]))
    }

    return min
  }

  private fun inspect(root: TreeNode?, values: MutableSet<Int>) {
    root?.let {
      values.add(it.`val`)
      inspect(it.left, values)
      inspect(it.right, values)
    }
  }
}
