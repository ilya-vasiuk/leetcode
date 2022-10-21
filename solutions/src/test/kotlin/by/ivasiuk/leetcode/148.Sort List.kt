package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class SortListTest {
  private val solution = SortList()

  @Test
  fun example1() {
    val head = ListNode(4).also {
      it.next = ListNode(2).also {
        it.next = ListNode(1).also {
          it.next = ListNode(3)
        }
      }
    }

    val result = solution.sortList(head)
    assertContentEquals(listOf(1, 2, 3, 4), result?.toList())
  }

  @Test
  fun example2() {
    val head = ListNode(-1).also {
      it.next = ListNode(5).also {
        it.next = ListNode(3).also {
          it.next = ListNode(4).also {
            it.next = ListNode(0)
          }
        }
      }
    }

    val result = solution.sortList(head)
    assertContentEquals(listOf(-1, 0, 3, 4, 5), result?.toList())
  }
}
