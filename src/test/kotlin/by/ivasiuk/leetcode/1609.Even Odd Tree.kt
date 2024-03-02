package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class EvenOddTreeTest {
  private val solution = EvenOddTree()

  @Test
  fun example1() {
    assertTrue {
      solution.isEvenOddTree(
        root = TreeNode(1).apply {
          left = TreeNode(10).apply {
            left = TreeNode(3).apply {
              left = TreeNode(12)
              right = TreeNode(8)
            }
          }
          right = TreeNode(4).apply {
            left = TreeNode(7).apply {
              left = TreeNode(6)
            }
            right = TreeNode(9).apply {
              right = TreeNode(2)
            }
          }
        }
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.isEvenOddTree(
        root = TreeNode(5).apply {
          left = TreeNode(4).apply {
            left = TreeNode(3)
            right = TreeNode(3)
          }
          right = TreeNode(2).apply {
            left = TreeNode(7)
          }
        }
      )
    }
  }

  @Test
  fun example3() {
    assertFalse {
      solution.isEvenOddTree(
        root = TreeNode(5).apply {
          left = TreeNode(9).apply {
            left = TreeNode(3)
            right = TreeNode(5)
          }
          right = TreeNode(1).apply {
            left = TreeNode(7)
          }
        }
      )
    }
  }

  @Test
  fun failed() {
    assertFalse {
      solution.isEvenOddTree(
        root = TreeNode(2)
      )
    }
  }
}
