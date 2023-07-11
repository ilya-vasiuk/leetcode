package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class AllNodesDistanceKInBinaryTreeTest {
  private val solution = AllNodesDistanceKInBinaryTree()

  @Test
  fun example1() {
    val target = TreeNode(5).apply {
      left = TreeNode(6)
      right = TreeNode(2).apply {
        left = TreeNode(7)
        right = TreeNode(4)
      }
    }

    assertContentEquals(
      expected = listOf(1, 7, 4),
      actual = solution.distanceK(
        root = TreeNode(3).apply {
          left = target
          right = TreeNode(1).apply {
            left = TreeNode(0)
            right = TreeNode(8)
          }
        },
        target = target,
        k = 2,
      )
    )
  }

  @Test
  fun example2() {
    val target = TreeNode(1)

    assertContentEquals(
      expected = emptyList(),
      actual = solution.distanceK(
        root = target,
        target = target,
        k = 3,
      )
    )
  }
}
