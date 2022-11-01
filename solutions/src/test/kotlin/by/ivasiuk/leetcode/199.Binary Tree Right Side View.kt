package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class BinaryTreeRightSideViewTest {
  private val solution = BinaryTreeRightSideView()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(1, 3, 4),
      actual = solution.rightSideView(
        root = TreeNode(1).also {
          it.left = TreeNode(2).also {
            it.right = TreeNode(5)
          }
          it.right = TreeNode(3).also {
            it.right = TreeNode(4)
          }
        }
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(1, 3),
      actual = solution.rightSideView(
        root = TreeNode(1).also {
          it.right = TreeNode(3)
        }
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = emptyList(),
      actual = solution.rightSideView(null)
    )
  }
}