package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class MergeInBetweenLinkedListsTest {
  private val solution = MergeInBetweenLinkedLists()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(10, 1, 13, 1000000, 1000001, 1000002, 5),
      actual = solution.mergeInBetween(
        list1 = ListNode.fromList(10, 1, 13, 6, 9, 5),
        a = 3,
        b = 4,
        list2 = ListNode.fromList(1000000, 1000001, 1000002),
      )?.toList()
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(0, 1, 1000000, 1000001, 1000002, 1000003, 1000004, 6),
      actual = solution.mergeInBetween(
        list1 = ListNode.fromList(0, 1, 2, 3, 4, 5, 6),
        a = 2,
        b = 5,
        list2 = ListNode.fromList(1000000, 1000001, 1000002, 1000003, 1000004),
      )?.toList()
    )
  }
}
