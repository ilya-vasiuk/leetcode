package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumDistanceBetweenBSTNodesTest {
  private val solution = MinimumDistanceBetweenBSTNodes()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.minDiffInBST(
        root = TreeNode(4).also {
          it.left = TreeNode(2).also {
            it.left = TreeNode(1)
            it.right = TreeNode(3)
          }
          it.right = TreeNode(6)
        }
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.minDiffInBST(
        root = TreeNode(1).also {
          it.left = TreeNode(0)
          it.right = TreeNode(48).also {
            it.left = TreeNode(12)
            it.right = TreeNode(49)
          }
        }
      )
    )
  }
}
