package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.TreeNode
import kotlin.test.*

class BSTIteratorTest {
  @Test
  fun example1() {
    val root = TreeNode(7).also {
      it.left = TreeNode(3)
      it.right = TreeNode(15).also {
        it.left = TreeNode(9)
        it.right = TreeNode(20)
      }
    }

    val iterator = BSTIterator(root)
    assertEquals(3, iterator.next())
    assertEquals(7, iterator.next())
    assertTrue(iterator.hasNext())
    assertEquals(9, iterator.next())
    assertTrue(iterator.hasNext())
    assertEquals(15, iterator.next())
    assertTrue(iterator.hasNext())
    assertEquals(20, iterator.next())
    assertFalse(iterator.hasNext())
  }
}