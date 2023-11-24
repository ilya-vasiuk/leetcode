package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumDepthOfBinaryTreeTest {
  private val solution = MinimumDepthOfBinaryTree()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.minDepth(
        root = TreeNode(3).apply {
          left = TreeNode(9)
          right = TreeNode(20).apply {
            left = TreeNode(15)
            right = TreeNode(7)
          }
        }
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 5,
      actual = solution.minDepth(
        root = TreeNode(2).apply {
          right = TreeNode(3).apply {
            right = TreeNode(4).apply {
              right = TreeNode(5).apply {
                right = TreeNode(6)
              }
            }
          }
        }
      )
    )
  }
}
