package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class CountCompleteTreeNodesTest {
  private val solution = CountCompleteTreeNodes()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.countNodes(
        root = TreeNode(1).also {
          it.left = TreeNode(2).also {
            it.left = TreeNode(4)
            it.right = TreeNode(5)
          }
          it.right = TreeNode(3).also {
            it.left = TreeNode(6)
          }
        }
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.countNodes(null)
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1,
      actual = solution.countNodes(
        root = TreeNode(1)
      )
    )
  }

  @Test
  fun example4() {
    assertEquals(
      expected = 5,
      actual = solution.countNodes(
        root = TreeNode(1).also {
          it.left = TreeNode(2).also {
            it.left = TreeNode(4)
            it.right = TreeNode(5)
          }
          it.right = TreeNode(3)
        }
      )
    )
  }
}