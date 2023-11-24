package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumLevelSumOfABinaryTreeTest {
  private val solution = MaximumLevelSumOfABinaryTree()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.maxLevelSum(
        root = TreeNode(1).apply {
          left = TreeNode(7).apply {
            left = TreeNode(7)
            right = TreeNode(-8)
          }
          right = TreeNode(0)
        }
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.maxLevelSum(
        root = TreeNode(989).apply {
          right = TreeNode(10250).apply {
            left = TreeNode(98693)
            right = TreeNode(-89388).apply {
              right = TreeNode(-32127)
            }
          }
        }
      )
    )
  }
}
