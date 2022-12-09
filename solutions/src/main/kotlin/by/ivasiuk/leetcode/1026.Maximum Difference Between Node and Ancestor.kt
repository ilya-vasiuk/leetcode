package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.math.abs

/**
 * @see <a href="https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/">
 *   Maximum Difference Between Node and Ancestor</a>
 */
class MaximumDifferenceBetweenNodeAndAncestor {
  fun maxAncestorDiff(root: TreeNode?, min: Int = Int.MAX_VALUE, max: Int = Int.MIN_VALUE): Int =
    root?.let {
      maxOf(
        maxAncestorDiff(it.left, minOf(it.`val`, min), maxOf(it.`val`, max)),
        maxAncestorDiff(it.right, minOf(it.`val`, min), maxOf(it.`val`, max))
      )
    } ?: abs(max - min)
}
