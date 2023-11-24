package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumDepthOfBinaryTreeTest {
  private val solution = MaximumDepthOfBinaryTree()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.maxDepth(
        root = TreeNode(3).also {
          it.left = TreeNode(9)
          it.right = TreeNode(20).also {
            it.left = TreeNode(15)
            it.right = TreeNode(7)
          }
        }
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.maxDepth(
        root = TreeNode(1).also {
          it.right = TreeNode(2)
        }
      )
    )
  }
}