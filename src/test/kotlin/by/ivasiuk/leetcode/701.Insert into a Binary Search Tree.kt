package by.ivasiuk.leetcode

import kotlin.test.Test
import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.assertContentEquals

class InsertIntoABinarySearchTreeTest {
  private val solution = InsertIntoABinarySearchTree()
  private val treeTraversal = BinaryTreeLevelOrderTraversal()

  @Test
  fun example1() {
    val expected = TreeNode(4).also {
      it.left = TreeNode(2).also {
        it.left = TreeNode(1)
        it.right = TreeNode(3)
      }
      it.right = TreeNode(7).also {
        it.left = TreeNode(5)
      }
    }

    val root = TreeNode(4).also {
      it.left = TreeNode(2).also {
        it.left = TreeNode(1)
        it.right = TreeNode(3)
      }
      it.right = TreeNode(7)
    }

    assertContentEquals(
      expected = treeTraversal.levelOrder(expected),
      actual = treeTraversal.levelOrder(solution.insertIntoBST(root, 5))
    )
  }

  @Test
  fun example2() {
    val expected = TreeNode(40).also {
      it.left = TreeNode(20).also {
        it.left = TreeNode(10)
        it.right = TreeNode(25).also {
          it.right = TreeNode(30)
        }
      }
      it.right = TreeNode(60).also {
        it.left = TreeNode(50)
        it.right = TreeNode(70)
      }
    }

    val root = TreeNode(40).also {
      it.left = TreeNode(20).also {
        it.left = TreeNode(10)
        it.right = TreeNode(30)
      }
      it.right = TreeNode(60).also {
        it.left = TreeNode(50)
        it.right = TreeNode(70)
      }
    }

    assertContentEquals(
      expected = treeTraversal.levelOrder(expected),
      actual = treeTraversal.levelOrder(solution.insertIntoBST(root, 25))
    )
  }
}