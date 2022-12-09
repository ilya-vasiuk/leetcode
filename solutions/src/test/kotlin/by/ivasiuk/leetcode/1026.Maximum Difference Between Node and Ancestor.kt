package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumDifferenceBetweenNodeAndAncestorTest {
  private val solution = MaximumDifferenceBetweenNodeAndAncestor()

  @Test
  fun example1() {
    assertEquals(
      expected = 7,
      actual = solution.maxAncestorDiff(
        root = TreeNode(8).also {
          it.left = TreeNode(3).also {
            it.left = TreeNode(1)
            it.right = TreeNode(6).also {
              it.left = TreeNode(4)
              it.right = TreeNode(7)
            }
          }
          it.right = TreeNode(10).also {
            it.right = TreeNode(14).also {
              it.left = TreeNode(13)
            }
          }
        }
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.maxAncestorDiff(
        root = TreeNode(1).also {
          it.right = TreeNode(2).also {
            it.right = TreeNode(0).also {
              it.left = TreeNode(3)
            }
          }
        }
      )
    )
  }
}