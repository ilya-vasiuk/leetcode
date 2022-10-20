package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class RemoveNthNodeFromEndOfListTest {
  private val solution = RemoveNthNodeFromEndOfList()

  @Test
  fun example1() {
    val head = ListNode(1).also {
      it.next = ListNode(2).also {
        it.next = ListNode(3).also {
          it.next = ListNode(4).also {
            it.next = ListNode(5)
          }
        }
      }
    }
    val result = solution.removeNthFromEnd(head, 2)
    assertContentEquals(listOf(1, 2, 3, 5), result?.toList())
  }

  @Test
  fun example2() {
    val head = ListNode(1).also {
      it.next = ListNode(2)
    }
    val result = solution.removeNthFromEnd(head, 1)
    assertContentEquals(listOf(1), result?.toList())
  }
}