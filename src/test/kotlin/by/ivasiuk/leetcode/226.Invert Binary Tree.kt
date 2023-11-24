package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.*

class InvertBinaryTreeTest {
  private val solution = InvertBinaryTree()
  private val treeTraversal = BinaryTreeLevelOrderTraversal()

  @Test
  fun example1() {
    val root = TreeNode(4).also {
      it.left = TreeNode(2).also {
        it.left = TreeNode(1)
        it.right = TreeNode(3)
      }
      it.right = TreeNode(7).also {
        it.left = TreeNode(6)
        it.right = TreeNode(9)
      }
    }

    val expected = treeTraversal.levelOrder(root)
    val result = solution.invertTree(root)

    assertContentEquals(expected, treeTraversal.levelOrder(result))
  }

  @Test
  fun example2() {
    val root = TreeNode(2).also {
      it.left = TreeNode(1)
      it.right = TreeNode(3)
    }

    val expected = treeTraversal.levelOrder(root)
    val result = solution.invertTree(root)

    assertContentEquals(expected, treeTraversal.levelOrder(result))
  }

  @Test
  fun example3() {
    val expected = treeTraversal.levelOrder(null)
    val result = solution.invertTree(null)

    assertContentEquals(expected, treeTraversal.levelOrder(result))
  }
}