package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class SumRootToLeafNumbersTest {
  private val solution = SumRootToLeafNumbers()

  @Test
  fun example1() {
    assertEquals(
      expected = 25,
      actual = solution.sumNumbers(
        root = TreeNode(1).apply {
          left = TreeNode(2)
          right = TreeNode(3)
        }
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1026,
      actual = solution.sumNumbers(
        root = TreeNode(4).apply {
          left = TreeNode(9).apply {
            left = TreeNode(5)
            right = TreeNode(1)
          }
          right = TreeNode(0)
        }
      )
    )
  }
}
