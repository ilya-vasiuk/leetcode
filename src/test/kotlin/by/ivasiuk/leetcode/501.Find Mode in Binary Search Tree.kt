package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class FindModeInBinarySearchTreeTest {
  private val solution = FindModeInBinarySearchTree()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(2),
      actual = solution.findMode(
        root = TreeNode(1).apply {
          right = TreeNode(2).apply {
            left = TreeNode(2)
          }
        }
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(0),
      actual = solution.findMode(
        root = TreeNode(0)
      )
    )
  }
}
