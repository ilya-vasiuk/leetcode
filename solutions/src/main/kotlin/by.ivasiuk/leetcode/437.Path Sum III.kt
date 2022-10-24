package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/path-sum-iii/">
 *   Path Sum III</a>
 */
class PathSum3 {
  fun pathSum(root: TreeNode?, targetSum: Int): Int {
    val sums = mutableMapOf(
      0L to 1
    )

    return countSums(root, targetSum, sums)
  }

  private fun countSums(
    node: TreeNode?,
    targetSum: Int,
    sums: MutableMap<Long, Int>,
    currentSum: Long = 0
  ): Int =
    node?.let {
      val sum = currentSum + it.`val`
      val diff = sum - targetSum
      var sumCount = sums.getOrDefault(diff, 0)
      sums[sum] = sums.getOrDefault(sum, 0) + 1

      sumCount += countSums(node.left, targetSum, sums, sum)
      sumCount += countSums(node.right, targetSum, sums, sum)
      sums[sum] = sums[sum]!! - 1
      sumCount
    } ?: 0
}