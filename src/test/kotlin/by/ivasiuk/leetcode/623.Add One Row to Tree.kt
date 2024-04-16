package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertTrue

class AddOneRowToTreeTest {
  private val solution = AddOneRowToTree()
  private val check = SameTree()

  @Test
  fun example1() {
    assertTrue {
      check.isSameTree(
        p = TreeNode(4).apply {
          left = TreeNode(1).apply {
            left = TreeNode(2).apply {
              left = TreeNode(3)
              right = TreeNode(1)
            }
          }
          right = TreeNode(1).apply {
            right = TreeNode(6).apply {
              left = TreeNode(5)
            }
          }
        },
        q = solution.addOneRow(
          root = TreeNode(4).apply {
            left = TreeNode(2).apply {
              left = TreeNode(3)
              right = TreeNode(1)
            }
            right = TreeNode(6).apply {
              left = TreeNode(5)
            }
          },
          `val` = 1,
          depth = 2,
        )
      )
    }
  }

  @Test
  fun example2() {
    assertTrue {
      check.isSameTree(
        p = TreeNode(4).apply {
          left = TreeNode(2).apply {
            left = TreeNode(1).apply {
              left = TreeNode(3)
            }
            right = TreeNode(1).apply {
              right = TreeNode(1)
            }
          }
        },
        q = solution.addOneRow(
          root = TreeNode(4).apply {
            left = TreeNode(2).apply {
              left = TreeNode(3)
              right = TreeNode(1)
            }
          },
          `val` = 1,
          depth = 3,
        )
      )
    }
  }
}
