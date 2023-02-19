package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class BinaryTreeZigzagLevelOrderTraversalTest {
  private val solution = BinaryTreeZigzagLevelOrderTraversal()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = listOf(
        listOf(3),
        listOf(20, 9),
        listOf(15, 7),
      ),
      actual = solution.zigzagLevelOrder(
        root = TreeNode(3).also {
          it.left = TreeNode(9)
          it.right = TreeNode(20).also {
            it.left = TreeNode(15)
            it.right = TreeNode(7)
          }
        }
      )
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = listOf(
        listOf(1),
      ),
      actual = solution.zigzagLevelOrder(
        root = TreeNode(1)
      )
    )
  }

  @Test
  fun example3() {
    assertInnerCollectionsContentEquals(
      expected = listOf(),
      actual = solution.zigzagLevelOrder(
        root = null
      )
    )
  }
}
