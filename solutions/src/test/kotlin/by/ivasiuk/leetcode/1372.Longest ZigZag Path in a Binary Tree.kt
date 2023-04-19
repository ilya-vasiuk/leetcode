package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class LongestZigZagPathInABinaryTreeTest {
  private val solution = LongestZigZagPathInABinaryTree()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.longestZigZag(
        root = TreeNode(1).apply {
          right = TreeNode(1).apply {
            left = TreeNode(1)
            right = TreeNode(1).apply {
              left = TreeNode(1).apply {
                right = TreeNode(1).apply {
                  right = TreeNode(1)
                }
              }
              right = TreeNode(1)
            }
          }
        }
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.longestZigZag(
        root = TreeNode(1).apply {
          right = TreeNode(1)
          left = TreeNode(1).apply {
            right = TreeNode(1).apply {
              right = TreeNode(1)
              left = TreeNode(1).apply {
                right = TreeNode(1)
              }
            }
          }
        }
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.longestZigZag(
        root = TreeNode(1)
      )
    )
  }
}
