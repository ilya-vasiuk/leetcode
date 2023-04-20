package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumWidthOfBinaryTreeTest {
  private val solution = MaximumWidthOfBinaryTree()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.widthOfBinaryTree(
        root = TreeNode(1).apply {
          left = TreeNode(3).apply {
            left = TreeNode(5)
            right = TreeNode(3)
          }
          right = TreeNode(2).apply {
            right = TreeNode(9)
          }
        }
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 7,
      actual = solution.widthOfBinaryTree(
        root = TreeNode(1).apply {
          left = TreeNode(3).apply {
            left = TreeNode(5).apply {
              left = TreeNode(6)
            }
          }
          right = TreeNode(2).apply {
            right = TreeNode(9).apply {
              left = TreeNode(7)
            }
          }
        }
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 2,
      actual = solution.widthOfBinaryTree(
        root = TreeNode(1).apply {
          left = TreeNode(3).apply {
            left = TreeNode(5)
          }
          right = TreeNode(2)
        }
      )
    )
  }
}
