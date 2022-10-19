package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertNull

class ReverseLinkedListTest {
  private val solution = ReverseLinkedList()

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

    val result = solution.reverseList(head)
    assertContentEquals(listOf(5, 4, 3, 2, 1), result?.toList())
  }

  @Test
  fun example2() {
    val head = ListNode(1).also {
      it.next = ListNode(2)
    }

    val result = solution.reverseList(head)
    assertContentEquals(listOf(2, 1), result?.toList())
  }

  @Test
  fun example3() {
    assertNull(solution.reverseList(null))
  }
}