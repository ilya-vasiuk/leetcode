package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidateBinarySearchTreeTest {
  private val solution = ValidateBinarySearchTree()

  @Test
  fun example1() {
    val root = TreeNode(2).also {
      it.left = TreeNode(1)
      it.right = TreeNode(3)
    }

    assertTrue {
      solution.isValidBST(root)
    }
  }

  @Test
  fun example2() {
    val root = TreeNode(5).also {
      it.left = TreeNode(1)
      it.right = TreeNode(4).also {
        it.left = TreeNode(3)
        it.right = TreeNode(6)
      }
    }

    assertFalse {
      solution.isValidBST(root)
    }
  }
}
