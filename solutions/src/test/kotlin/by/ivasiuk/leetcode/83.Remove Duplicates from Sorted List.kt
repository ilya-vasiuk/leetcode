package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class RemoveDuplicatesFromSortedListTest {
  private val solution = RemoveDuplicatesFromSortedList()

  @Test
  fun example1() {
    val head = ListNode.fromList(1, 1, 2)

    assertContentEquals(listOf(1, 2), solution.deleteDuplicates(head)?.toList())
  }

  @Test
  fun example2() {
    val head = ListNode.fromList(1, 1, 2, 3, 3)

    assertContentEquals(listOf(1, 2, 3), solution.deleteDuplicates(head)?.toList())
  }
}