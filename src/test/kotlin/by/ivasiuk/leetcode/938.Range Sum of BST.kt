package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class RangeSumOfBSTTest {
  private val solution = RangeSumOfBST()

  @Test
  fun example1() {
    assertEquals(
      expected = 32,
      actual = solution.rangeSumBST(
        root = TreeNode(10).also {
          it.left = TreeNode(5).also {
            it.left = TreeNode(3)
            it.right = TreeNode(7)
          }
          it.right = TreeNode(15).also {
            it.right = TreeNode(18)
          }
        },
        low = 7,
        high = 15,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 23,
      actual = solution.rangeSumBST(
        root = TreeNode(10).also {
          it.left = TreeNode(5).also {
            it.left = TreeNode(3).also {
              it.left = TreeNode(1)
            }
            it.right = TreeNode(7).also {
              it.left = TreeNode(6)
            }
          }
          it.right = TreeNode(15).also {
            it.left = TreeNode(13)
            it.right = TreeNode(18)
          }
        },
        low = 6,
        high = 10,
      )
    )
  }
}
