package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class RemoveDuplicatesFromSortedListTest {
  private val solution = RemoveDuplicatesFromSortedList()

  @Test
  fun example1() {
    val head = ListNode(1).also {
      it.next = ListNode(1).also {
        it.next = ListNode(2)
      }
    }

    assertContentEquals(listOf(1, 2), solution.deleteDuplicates(head)?.toList())
  }

  @Test
  fun example2() {
    val head = ListNode(1).also {
      it.next = ListNode(1).also {
        it.next = ListNode(2).also {
          it.next = ListNode(3).also {
            it.next = ListNode(3)
          }
        }
      }
    }

    assertContentEquals(listOf(1, 2, 3), solution.deleteDuplicates(head)?.toList())
  }
}