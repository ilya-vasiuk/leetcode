package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumAbsoluteDifferenceInBSTTest {
  private val solution = MinimumAbsoluteDifferenceInBST()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.getMinimumDifference(
        root = TreeNode(4).apply {
          left = TreeNode(2).apply {
            left = TreeNode(1)
            right = TreeNode(3)
          }
          right = TreeNode(6)
        }
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.getMinimumDifference(
        root = TreeNode(1).apply {
          left = TreeNode(0)
          right = TreeNode(48).apply {
            left = TreeNode(12)
            right = TreeNode(49)
          }
        }
      )
    )
  }
}
