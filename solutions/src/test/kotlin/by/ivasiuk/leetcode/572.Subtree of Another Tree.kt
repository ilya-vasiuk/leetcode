package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SubtreeOfAnotherTreeTest {
  private val solution = SubtreeOfAnotherTree()

  @Test
  fun example1() {
    assertTrue {
      solution.isSubtree(
        root = TreeNode(3).also {
          it.left = TreeNode(4).also {
            it.left = TreeNode(1)
            it.right = TreeNode(2)
          }
        },
        subRoot = TreeNode(4).also {
          it.left = TreeNode(1)
          it.right = TreeNode(2)
        },
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.isSubtree(
        root = TreeNode(3).also {
          it.left = TreeNode(4).also {
            it.left = TreeNode(1)
            it.right = TreeNode(2).also {
              it.left = TreeNode(0)
            }
          }
        },
        subRoot = TreeNode(4).also {
          it.left = TreeNode(1)
          it.right = TreeNode(2)
        },
      )
    }
  }
}
