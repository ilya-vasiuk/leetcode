package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class DiameterOfBinaryTreeTest {
  private val solution = DiameterOfBinaryTree()

  @Test
  fun example1() {
    val root = TreeNode(1).also {
      it.left = TreeNode(2).also {
        it.left = TreeNode(4)
        it.left = TreeNode(5)
      }
      it.right = TreeNode(3)
    }

    assertEquals(3, solution.diameterOfBinaryTree(root))
  }

  @Test
  fun example2() {
    val root = TreeNode(1).also {
      it.left = TreeNode(2)
    }

    assertEquals(1, solution.diameterOfBinaryTree(root))  }
}