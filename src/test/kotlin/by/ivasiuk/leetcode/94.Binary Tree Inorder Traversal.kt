package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertTrue

class BinaryTreeInorderTraversalTest {
  private val solution = BinaryTreeInorderTraversal()

  @Test
  fun example1() {
    val root = TreeNode(1).also {
      it.right = TreeNode(2).also {
        it.left = TreeNode(3)
      }
    }

    val result = solution.inorderTraversal(root)
    assertContentEquals(listOf(1, 3, 2), result)
  }

  @Test
  fun example2() {
    assertTrue {
      solution.inorderTraversal(null).isEmpty()
    }
  }

  @Test
  fun example3() {
    val root = TreeNode(1)

    val result = solution.inorderTraversal(root)
    assertContentEquals(listOf(1), result)
  }
}
