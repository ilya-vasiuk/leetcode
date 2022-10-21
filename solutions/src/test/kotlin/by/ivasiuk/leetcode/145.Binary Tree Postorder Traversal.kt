package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertTrue

class BinaryTreePostorderTraversalTest {
  private val solution = BinaryTreePostorderTraversal()

  @Test
  fun example1() {
    val root = TreeNode(1).also {
      it.right = TreeNode(2).also {
        it.left = TreeNode(3)
      }
    }

    val result = solution.postorderTraversal(root)
    assertContentEquals(listOf(3, 2, 1), result)
  }

  @Test
  fun example2() {
    assertTrue {
      solution.postorderTraversal(null).isEmpty()
    }
  }

  @Test
  fun example3() {
    val root = TreeNode(1)

    val result = solution.postorderTraversal(root)
    assertContentEquals(listOf(1), result)
  }
}
