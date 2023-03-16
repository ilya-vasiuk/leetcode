package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {
  private val solution = ConstructBinaryTreeFromInorderAndPostorderTraversal()

  @Test
  fun example1() {
    val root = solution.buildTree(
      inorder = intArrayOf(9, 3, 15, 20, 7),
      postorder = intArrayOf(9, 15, 7, 20, 3)
    )

    root!!.apply {
      assertEquals(3, `val`)
      assertEquals(9, left!!.`val`)
      right!!.apply {
        assertEquals(20, `val`)
        assertEquals(15, left!!.`val`)
        assertEquals(7, right!!.`val`)
      }
    }
  }

  @Test
  fun example2() {
    val root = solution.buildTree(
      inorder = intArrayOf(-1),
      postorder = intArrayOf(-1)
    )

    assertEquals(-1, root!!.`val`)
  }
}
