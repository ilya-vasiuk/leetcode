package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class OddEvenLinkedListTest {
  private val solution = OddEvenLinkedList()

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

    val result = solution.oddEvenList(head)
    assertContentEquals(listOf(1, 3, 5, 2, 4), result?.toList())
  }

  @Test
  fun example2() {
    val head = ListNode(2).also {
      it.next = ListNode(1).also {
        it.next = ListNode(3).also {
          it.next = ListNode(5).also {
            it.next = ListNode(6).also {
              it.next = ListNode(4).also {
                it.next = ListNode(7)
              }
            }
          }
        }
      }
    }

    val result = solution.oddEvenList(head)
    assertContentEquals(listOf(2, 3, 6, 7, 1, 5, 4), result?.toList())
  }
}
