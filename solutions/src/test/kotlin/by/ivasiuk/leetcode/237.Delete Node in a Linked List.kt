package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import by.ivasiuk.leetcode.DeleteNodeInALinkedList.ListNode

class DeleteNodeInALinkedListTest {
  private val solution = DeleteNodeInALinkedList()

  private fun ListNode?.toList(): List<Int> {
    val list = mutableListOf<Int>()
    var current = this

    while (current != null) {
      list.add(current.`val`)
      current = current.next
    }

    return list
  }

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