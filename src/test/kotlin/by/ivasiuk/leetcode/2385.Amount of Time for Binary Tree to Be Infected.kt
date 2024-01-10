package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class AmountOfTimeForBinaryTreeToBeInfectedTest {
  private val solution = AmountOfTimeForBinaryTreeToBeInfected()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.amountOfTime(
        root = TreeNode(1).apply {
          left = TreeNode(5).apply {
            right = TreeNode(4).apply {
              left = TreeNode(9)
              right = TreeNode(2)
            }
          }
          right = TreeNode(3).apply {
            left = TreeNode(10)
            right = TreeNode(6)
          }
        },
        start = 3,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.amountOfTime(
        root = TreeNode(1),
        start = 1,
      )
    )
  }
}
