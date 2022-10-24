package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class PathSum3Test {
  private val solution = PathSum3()

  @Test
  fun example1() {
    val root = TreeNode(10).also {
      it.left = TreeNode(5).also {
        it.left = TreeNode(3).also {
          it.left = TreeNode(3)
          it.right = TreeNode(-2)
        }
        it.right = TreeNode(2).also {
          it.right = TreeNode(1)
        }
      }
      it.right = TreeNode(-3).also {
        it.right = TreeNode(11)
      }
    }

    assertEquals(3, solution.pathSum(root, 8))
  }

  @Test
  fun example2() {
    val root = TreeNode(5).also {
      it.left = TreeNode(4).also {
        it.left = TreeNode(11).also {
          it.left = TreeNode(7)
          it.right = TreeNode(2)
        }
      }
      it.right = TreeNode(8).also {
        it.left = TreeNode(13)
        it.right = TreeNode(4).also {
          it.left = TreeNode(5)
          it.right = TreeNode(1)
        }
      }
    }

    assertEquals(3, solution.pathSum(root, 22))
  }
}