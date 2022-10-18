package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertNull

class MergeTwoSortedListsTest {
  private val solution = MergeTwoSortedLists()

  @Test
  fun example1() {
    val list1 = ListNode(1).also {
      it.next = ListNode(2).also {
        it.next = ListNode(4)
      }
    }

    val list2 = ListNode(1).also {
      it.next = ListNode(3).also {
        it.next = ListNode(4)
      }
    }

    val result = solution.mergeTwoLists(list1, list2)
    assertContentEquals(listOf(1, 1, 2, 3, 4, 4), result?.toList())
  }

  @Test
  fun example2() {
    val result = solution.mergeTwoLists(null, null)
    assertNull(result?.toList())
  }

  @Test
  fun example3() {
    val list2 = ListNode(0)

    val result = solution.mergeTwoLists(null, list2)
    assertContentEquals(listOf(0), result?.toList())
  }
}