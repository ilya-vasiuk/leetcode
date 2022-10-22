package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class BinaryTreeLevelOrderTraversalTest {
  private val solution = BinaryTreeLevelOrderTraversal()

  @Test
  fun example1() {
    val root = TreeNode(3).also {
      it.left = TreeNode(9)
      it.right = TreeNode(20).also {
        it.left = TreeNode(15)
        it.right = TreeNode(7)
      }
    }

    val expected = listOf(
      listOf(3),
      listOf(9, 20),
      listOf(15, 7)
    )

    assertContentEquals(expected, solution.levelOrder(root))
  }

  @Test
  fun example2() {
    val root = TreeNode(1)

    val expected = listOf(
      listOf(1)
    )

    assertContentEquals(expected, solution.levelOrder(root))
  }

  @Test
  fun example3() {
    assertContentEquals(emptyList(), solution.levelOrder(null))
  }
}