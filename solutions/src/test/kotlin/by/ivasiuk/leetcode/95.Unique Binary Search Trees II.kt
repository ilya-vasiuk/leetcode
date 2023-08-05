package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class UniqueBinarySearchTrees2Test {
  private val solution = UniqueBinarySearchTrees2()
  private val verifier = SameTree()

  @Test
  fun example1() {
    val expected = listOf(
      TreeNode(1).apply {
        right = TreeNode(3).apply {
          left = TreeNode(2)
        }
      },
      TreeNode(1).apply {
        right = TreeNode(2).apply {
          right = TreeNode(3)
        }
      },
      TreeNode(2).apply {
        left = TreeNode(1)
        right = TreeNode(3)
      },
      TreeNode(3).apply {
        left = TreeNode(2).apply {
          left = TreeNode(1)
        }
      },
      TreeNode(3).apply {
        left = TreeNode(1).apply {
          right = TreeNode(2)
        }
      },
    )

    val actual = solution.generateTrees(3)

    assertEquals(expected.size, actual.size)
    expected
      .map { e -> actual.any { a -> verifier.isSameTree(e, a) } }
      .forEach { assertTrue { it } }
  }

  @Test
  fun example2() {
    val expected = listOf(
      TreeNode(1)
    )

    val actual = solution.generateTrees(1)

    assertEquals(expected.size, actual.size)
    expected
      .map { e -> actual.any { a -> verifier.isSameTree(e, a) } }
      .forEach { assertTrue { it } }
  }
}
