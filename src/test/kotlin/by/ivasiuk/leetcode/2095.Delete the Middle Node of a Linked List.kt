package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class DeleteTheMiddleNodeOfALinkedListTest {
  private val solution = DeleteTheMiddleNodeOfALinkedList()

  @Test
  fun example1() {
    val head = ListNode.fromList(1, 3, 4, 7, 1, 2, 6)

    val result = solution.deleteMiddle(head)
    assertContentEquals(listOf(1, 3, 4, 1, 2, 6), result?.toList())
  }

  @Test
  fun example2() {
    val head = ListNode.fromList(1, 2, 3, 4)

    val result = solution.deleteMiddle(head)
    assertContentEquals(listOf(1, 2, 4), result?.toList())
  }

  @Test
  fun oneElement() {
    val head = ListNode(1)

    val result = solution.deleteMiddle(head)
    assertContentEquals(emptyList(), result?.toList() ?: emptyList())
  }

  @Test
  fun twoElements() {
    val head = ListNode.fromList(1, 2)

    val result = solution.deleteMiddle(head)
    assertContentEquals(listOf(1), result?.toList())
  }
}