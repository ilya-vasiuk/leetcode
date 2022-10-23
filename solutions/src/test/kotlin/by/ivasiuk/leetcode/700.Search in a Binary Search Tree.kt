package by.ivasiuk.leetcode

import kotlin.test.Test
import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.assertEquals
import kotlin.test.assertNull

class SearchInABinarySearchTreeTest {
  private val solution = SearchInABinarySearchTree()

  @Test
  fun example1() {
    val expected = TreeNode(2).also {
      it.left = TreeNode(1)
      it.right = TreeNode(3)
    }
    val root = TreeNode(4).also {
      it.left = expected
      it.right = TreeNode(7)
    }

    assertEquals(expected, solution.searchBST(root, 2))
  }

  @Test
  fun example2() {
    val root = TreeNode(4).also {
      it.left = TreeNode(2).also {
        it.left = TreeNode(1)
        it.right = TreeNode(3)
      }
      it.right = TreeNode(7)
    }
    assertNull(solution.searchBST(root, 5))
  }
}