package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import by.ivasiuk.leetcode.common.ListNode

class DeleteNodeInALinkedListTest {
  private val solution = DeleteNodeInALinkedList()

  @Test
  fun example1() {
    val head = ListNode(4).also {
      it.next = ListNode(5).also {
        it.next = ListNode(1).also {
          it.next = ListNode(9)
        }
      }
    }

    solution.deleteNode(head.next)
    assertContentEquals(listOf(4, 1, 9), head.toList())
  }

  @Test
  fun example2() {
    val head = ListNode(4).also {
      it.next = ListNode(5).also {
        it.next = ListNode(1).also {
          it.next = ListNode(9)
        }
      }
    }

    solution.deleteNode(head.next?.next)
    assertContentEquals(listOf(4, 5, 9), head.toList())
  }
}