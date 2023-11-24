package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class OddEvenLinkedListTest {
  private val solution = OddEvenLinkedList()

  @Test
  fun example1() {
    val head = ListNode.fromList(1, 2, 3, 4, 5)
    val result = solution.oddEvenList(head)

    assertContentEquals(listOf(1, 3, 5, 2, 4), result?.toList())
  }

  @Test
  fun example2() {
    val head = ListNode.fromList(2, 1, 3, 5, 6, 4, 7)
    val result = solution.oddEvenList(head)

    assertContentEquals(listOf(2, 3, 6, 7, 1, 5, 4), result?.toList())
  }
}
