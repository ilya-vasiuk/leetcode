package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.*

class LowestCommonAncestorOfABinarySearchTreeTest {
  private val solution = LowestCommonAncestorOfABinarySearchTree()

  @Test
  fun example1() {
    val root = TreeNode(6).also {
      it.left = TreeNode(2).also {
        it.left = TreeNode(0)
        it.right = TreeNode(4).also {
          it.left = TreeNode(3)
          it.right = TreeNode(5)
        }
      }
      it.right = TreeNode(8).also {
        it.left = TreeNode(7)
        it.right = TreeNode(9)
      }
    }

    assertEquals(6, solution.lowestCommonAncestor(root, TreeNode(2), TreeNode(8))?.`val`)
  }

  @Test
  fun example2() {
    val root = TreeNode(6).also {
      it.left = TreeNode(2).also {
        it.left = TreeNode(0)
        it.right = TreeNode(4).also {
          it.left = TreeNode(3)
          it.right = TreeNode(5)
        }
      }
      it.right = TreeNode(8).also {
        it.left = TreeNode(7)
        it.right = TreeNode(9)
      }
    }

    assertEquals(2, solution.lowestCommonAncestor(root, TreeNode(2), TreeNode(4))?.`val`)
  }

  @Test
  fun example3() {
    val root = TreeNode(2).also {
      it.left = TreeNode(1)
    }

    assertEquals(2, solution.lowestCommonAncestor(root, TreeNode(1), TreeNode(2))?.`val`)
  }
}