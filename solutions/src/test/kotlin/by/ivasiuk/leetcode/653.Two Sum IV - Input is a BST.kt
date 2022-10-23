package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.*

class TwoSum4InputIsABstTest {
  @Test
  fun example1() {
    val solution = TwoSum4InputIsABst()
    val root = TreeNode(5).also {
      it.left = TreeNode(3).also {
        it.left = TreeNode(2)
        it.right = TreeNode(4)
      }
      it.right = TreeNode(6).also {
        it.right = TreeNode(7)
      }
    }

    assertTrue {
      solution.findTarget(root, 9)
    }
  }

  @Test
  fun example2() {
    val solution = TwoSum4InputIsABst()
    val root = TreeNode(5).also {
      it.left = TreeNode(3).also {
        it.left = TreeNode(2)
        it.right = TreeNode(4)
      }
      it.right = TreeNode(6).also {
        it.right = TreeNode(7)
      }
    }

    assertFalse {
      solution.findTarget(root, 28)
    }
  }
}