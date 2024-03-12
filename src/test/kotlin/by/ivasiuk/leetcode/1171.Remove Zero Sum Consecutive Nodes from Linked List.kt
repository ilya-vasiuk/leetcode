package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class RemoveZeroSumConsecutiveNodesFromLinkedListTest {
  private val solution = RemoveZeroSumConsecutiveNodesFromLinkedList()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(3, 1),
      actual = solution.removeZeroSumSublists(ListNode.fromList(1, 2, -3, 3, 1))?.toList()
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(1, 2, 4),
      actual = solution.removeZeroSumSublists(ListNode.fromList(1, 2, 3, -3, 4))?.toList()
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = listOf(1),
      actual = solution.removeZeroSumSublists(ListNode.fromList(1, 2, 3, -3, -2))?.toList()
    )
  }
}
