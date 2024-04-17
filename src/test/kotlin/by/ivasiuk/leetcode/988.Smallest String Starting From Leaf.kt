package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

import by.ivasiuk.leetcode.common.TreeNode

class SmallestStringStartingFromLeafTest {
  private val solution = SmallestStringStartingFromLeaf()

  @Test
  fun example1() {
    assertEquals(
      expected = "dba",
      actual = solution.smallestFromLeaf(
        root = TreeNode(0).apply {
          left = TreeNode(1).apply {
            left = TreeNode(3)
            right = TreeNode(4)
          }
          right = TreeNode(2).apply {
            left = TreeNode(3)
            right = TreeNode(4)
          }
        }
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "adz",
      actual = solution.smallestFromLeaf(
        root = TreeNode(25).apply {
          left = TreeNode(1).apply {
            left = TreeNode(1)
            right = TreeNode(3)
          }
          right = TreeNode(3).apply {
            left = TreeNode(0)
            right = TreeNode(2)
          }
        }
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "abc",
      actual = solution.smallestFromLeaf(
        root = TreeNode(2).apply {
          left = TreeNode(2).apply {
            right = TreeNode(1).apply {
              left = TreeNode(0)
            }
          }
          right = TreeNode(1).apply {
            left = TreeNode(0)
          }
        }
      )
    )
  }
}
