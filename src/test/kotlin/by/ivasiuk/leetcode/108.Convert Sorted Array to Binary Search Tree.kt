package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class ConvertSortedArrayToBinarySearchTreeTest {
  private val solution = ConvertSortedArrayToBinarySearchTree()
  private val treeTraversal = BinaryTreeInorderTraversal()

  @Test
  fun example1() {
    val input = intArrayOf(-10, -3, 0, 5, 9)
    val result = solution.sortedArrayToBST(input)

    assertContentEquals(input.toList(), treeTraversal.inorderTraversal(result))
  }

  @Test
  fun example2() {
    val input = intArrayOf(1, 3)
    val result = solution.sortedArrayToBST(input)

    assertContentEquals(input.toList(), treeTraversal.inorderTraversal(result))
  }
}