package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class PseudoPalindromicPathsInABinaryTreeTest {
  private val solution = PseudoPalindromicPathsInABinaryTree()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.pseudoPalindromicPaths(
        root = TreeNode(2).apply {
          left = TreeNode(3).apply {
            left = TreeNode(3)
            right = TreeNode(1)
          }
          right = TreeNode(1).apply {
            right = TreeNode(1)
          }
        }
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.pseudoPalindromicPaths(
        root = TreeNode(2).apply {
          left = TreeNode(1).apply {
            left = TreeNode(1)
            right = TreeNode(3).apply {
              right = TreeNode(1)
            }
          }
          right = TreeNode(1)
        }
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1,
      actual = solution.pseudoPalindromicPaths(
        root = TreeNode(9)
      )
    )
  }
}
