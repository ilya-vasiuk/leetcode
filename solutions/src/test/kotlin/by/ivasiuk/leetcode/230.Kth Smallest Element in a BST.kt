package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.*

class KthSmallestElementInABstTest {
  private val solution = KthSmallestElementInABst()

  @Test
  fun example1() {
    val root = TreeNode(3).also {
      it.left = TreeNode(1).also {
        it.right = TreeNode(2)
      }
      it.right = TreeNode(4)
    }

    assertEquals(1, solution.kthSmallest(root, 1))
  }

  @Test
  fun example2() {
    val root = TreeNode(5).also {
      it.left = TreeNode(3).also {
        it.left = TreeNode(2).also {
          it.left = TreeNode(1)
        }
        it.right = TreeNode(4)
      }
      it.right = TreeNode(6)
    }

    assertEquals(3, solution.kthSmallest(root, 3))
  }
}