package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SymmetricTreeTest {
  private val solution = SymmetricTree()

  @Test
  fun example1() {
    val root = TreeNode(1).also {
      it.left = TreeNode(2).also {
        it.left = TreeNode(3)
        it.right = TreeNode(4)
      }
      it.right = TreeNode(2).also {
        it.left = TreeNode(4)
        it.right = TreeNode(3)
      }
    }

    assertTrue {
      solution.isSymmetric(root)
    }
  }

  @Test
  fun example2() {
    val root = TreeNode(1).also {
      it.left = TreeNode(2).also {
        it.right = TreeNode(3)
      }
      it.right = TreeNode(2).also {
        it.right = TreeNode(3)
      }
    }

    assertFalse {
      solution.isSymmetric(root)
    }
  }
}