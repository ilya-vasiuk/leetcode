package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class ConvertSortedListToBinarySearchTreeTest {
  private val solution = ConvertSortedListToBinarySearchTree()

  @Test
  fun example1() {
    val root = solution.sortedListToBST(
      head = ListNode(-10).apply {
        next = ListNode(-3).apply {
          next = ListNode(0).apply {
            next = ListNode(5).apply {
              next = ListNode(9)
            }
          }
        }
      }
    )

    assertEquals(0, root?.`val`)
    assertEquals(-3, root?.left?.`val`)
    assertEquals(-10, root?.left?.left?.`val`)
    assertEquals(9, root?.right?.`val`)
    assertEquals(5, root?.right?.left?.`val`)
  }

  @Test
  fun example2() {
    assertNull(solution.sortedListToBST(null))
  }
}
