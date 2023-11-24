package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.*

class CheckCompletenessOfABinaryTreeTest {
  private val solution = CheckCompletenessOfABinaryTree()

  @Test
  fun example1() {
    assertTrue {
      solution.isCompleteTree(
        root = TreeNode(1).apply {
          left = TreeNode(2).apply {
            left = TreeNode(4)
            right = TreeNode(5)
          }
          right = TreeNode(3).apply {
            left = TreeNode(6)
          }
        }
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.isCompleteTree(
        root = TreeNode(1).apply {
          left = TreeNode(2).apply {
            left = TreeNode(4)
            right = TreeNode(5)
          }
          right = TreeNode(3).apply {
            right = TreeNode(7)
          }
        }
      )
    }
  }
}
