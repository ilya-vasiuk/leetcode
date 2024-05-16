package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class EvaluateBooleanBinaryTreeTest {
  private val solution = EvaluateBooleanBinaryTree()

  @Test
  fun example1() {
    assertTrue {
      solution.evaluateTree(
        root = TreeNode(2).apply {
          left = TreeNode(1)
          right = TreeNode(3).apply {
            left = TreeNode(0)
            right = TreeNode(1)
          }
        }
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.evaluateTree(
        root = TreeNode(0)
      )
    }
  }
}
