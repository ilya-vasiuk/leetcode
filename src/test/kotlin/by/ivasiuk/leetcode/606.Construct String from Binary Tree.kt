package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class ConstructStringFromBinaryTreeTest {
  private val solution = ConstructStringFromBinaryTree()

  @Test
  fun example1() {
    assertEquals(
      expected = "1(2(4))(3)",
      actual = solution.tree2str(
        root = TreeNode(1).apply {
          left = TreeNode(2).apply {
            left = TreeNode(4)
          }
          right = TreeNode(3)
        }
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "1(2()(4))(3)",
      actual = solution.tree2str(
        root = TreeNode(1).apply {
          left = TreeNode(2).apply {
            right = TreeNode(4)
          }
          right = TreeNode(3)
        }
      )
    )
  }
}
