package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BalancedBinaryTreeTest {
  private val solution = BalancedBinaryTree()

  @Test
  fun example1() {
    val root = TreeNode(3).also {
      it.left = TreeNode(9)
      it.right = TreeNode(20).also {
        it.left = TreeNode(15)
        it.right = TreeNode(7)
      }
    }

    assertTrue {
      solution.isBalanced(root)
    }
  }

  @Test
  fun example2() {
    val root = TreeNode(1).also {
      it.left = TreeNode(2).also {
        it.left = TreeNode(3).also {
          it.left = TreeNode(4)
          it.right = TreeNode(4)
        }
        it.right = TreeNode(3)
      }
      it.right = TreeNode(2)
    }

    assertFalse {
      solution.isBalanced(root)
    }
  }
}