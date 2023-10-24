package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class FindLargestValueInEachTreeRowTest {
  private val solution = FindLargestValueInEachTreeRow()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(1, 3, 9),
      actual = solution.largestValues(
        root = TreeNode(1).apply {
          left = TreeNode(3).apply {
            left = TreeNode(5)
            right = TreeNode(3)
          }
          right = TreeNode(2).apply {
            right = TreeNode(9)
          }
        }
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(1, 3),
      actual = solution.largestValues(
        root = TreeNode(1).apply {
          left = TreeNode(2)
          right = TreeNode(3)
        }
      )
    )
  }
}
