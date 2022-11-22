package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class SumOfLeftLeavesTest {
  private val solution = SumOfLeftLeaves()

  @Test
  fun example1() {
    assertEquals(
      expected = 24,
      actual = solution.sumOfLeftLeaves(
        root = TreeNode(3).also {
          it.left = TreeNode(9)
          it.right = TreeNode(20).also {
            it.left = TreeNode(15)
            it.right = TreeNode(7)
          }
        }
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.sumOfLeftLeaves(
        root = TreeNode(1)
      )
    )
  }
}
