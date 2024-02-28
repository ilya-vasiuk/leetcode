package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class FindBottomLeftTreeValueTest {
  private val solution = FindBottomLeftTreeValue()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.findBottomLeftValue(
        root = TreeNode(2).apply {
          left = TreeNode(1)
          right = TreeNode(3)
        }
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 7,
      actual = solution.findBottomLeftValue(
        root = TreeNode(1).apply {
          left = TreeNode(2).apply {
            left = TreeNode(4)
          }
          right = TreeNode(3).apply {
            left = TreeNode(5).apply {
              left = TreeNode(7)
            }
            right = TreeNode(6)
          }
        }
      )
    )
  }
}
