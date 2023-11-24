package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PathSumTest {
  private val solution = PathSum()

  @Test
  fun example1() {
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
          it.right = TreeNode(1)
        }
      }
    }

    assertTrue {
      solution.hasPathSum(root, 22)
    }
  }

  @Test
  fun example2() {
    val root = TreeNode(1).also {
      it.left = TreeNode(2)
      it.right = TreeNode(3)
    }

    assertFalse {
      solution.hasPathSum(root, 5)
    }
  }

  @Test
  fun example3() {
    val root = TreeNode(-2).also {
      it.right = TreeNode(-3)
    }

    assertTrue {
      solution.hasPathSum(root, -5)
    }
  }
}