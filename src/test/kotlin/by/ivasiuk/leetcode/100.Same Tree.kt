package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.*

class SameTreeTest {
  private val solution = SameTree()

  @Test
  fun example1() {
    assertTrue {
      solution.isSameTree(
        p = TreeNode(1).also {
          it.left = TreeNode(2)
          it.right = TreeNode(3)
        },
        q = TreeNode(1).also {
          it.left = TreeNode(2)
          it.right = TreeNode(3)
        },
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.isSameTree(
        p = TreeNode(1).also {
          it.left = TreeNode(2)
        },
        q = TreeNode(1).also {
          it.right = TreeNode(2)
        },
      )
    }
  }

  @Test
  fun example3() {
    assertFalse {
      solution.isSameTree(
        p = TreeNode(1).also {
          it.left = TreeNode(2)
          it.right = TreeNode(1)
        },
        q = TreeNode(1).also {
          it.left = TreeNode(1)
          it.right = TreeNode(2)
        },
      )
    }
  }
}