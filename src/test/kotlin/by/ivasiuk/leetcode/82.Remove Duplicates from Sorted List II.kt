package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class RemoveDuplicatesFromSortedList2Test {
  private val solution = RemoveDuplicatesFromSortedList2()

  @Test
  fun example1() {
    val head = ListNode.fromList(1, 2, 3, 3, 4, 4, 5)

    assertContentEquals(listOf(1, 2, 5), solution.deleteDuplicates(head)?.toList())
  }

  @Test
  fun example2() {
    val head = ListNode.fromList(1, 1, 2, 3)

    assertContentEquals(listOf(2, 3), solution.deleteDuplicates(head)?.toList())
  }
}
