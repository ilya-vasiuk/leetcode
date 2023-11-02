package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class CountNodesEqualToAverageOfSubtreeTest {
  private val solution = CountNodesEqualToAverageOfSubtree()

  @Test
  fun example1() {
    assertEquals(
      expected = 5,
      actual = solution.averageOfSubtree(
        root = TreeNode(4).apply {
          left = TreeNode(8).apply {
            left = TreeNode(0)
            right = TreeNode(1)
          }
          right = TreeNode(5).apply {
            right = TreeNode(6)
          }
        }
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.averageOfSubtree(
        root = TreeNode(1)
      )
    )
  }
}
