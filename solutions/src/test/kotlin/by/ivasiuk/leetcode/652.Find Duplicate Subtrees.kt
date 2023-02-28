package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class FindDuplicateSubtreesTest {
  private val solution = FindDuplicateSubtrees()

  @Test
  fun example1() {
    val dup1 = TreeNode(4)
    val dup2 = TreeNode(2).also {
      it.left = dup1
    }

    assertContentEquals(
      expected = listOf(dup1, dup2),
      actual = solution.findDuplicateSubtrees(
        root = TreeNode(1).also {
          it.left = dup2
          it.right = TreeNode(3).also {
            it.left = dup2
            it.right = dup1
          }
        }
      )
    )
  }

  @Test
  fun example2() {
    val dup1 = TreeNode(1)

    assertContentEquals(
      expected = listOf(dup1),
      actual = solution.findDuplicateSubtrees(
        root = TreeNode(2).also {
          it.left = dup1
          it.right = dup1
        }
      )
    )
  }

  @Test
  fun example3() {
    val dup1 = TreeNode(3)
    val dup2 = TreeNode(2).also {
      it.left = dup1
    }

    assertContentEquals(
      expected = listOf(dup1, dup2),
      actual = solution.findDuplicateSubtrees(
        root = TreeNode(2).also {
          it.left = dup2
          it.right = dup2
        }
      )
    )
  }
}
