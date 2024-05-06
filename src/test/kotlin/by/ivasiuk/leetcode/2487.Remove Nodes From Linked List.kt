package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class RemoveNodesFromLinkedListTest {
  private val solution = RemoveNodesFromLinkedList()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(13, 8),
      actual = solution.removeNodes(
        ListNode.fromList(5, 2, 13, 3, 8),
      )?.toList()
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(1, 1, 1, 1),
      actual = solution.removeNodes(
        ListNode.fromList(1, 1, 1, 1),
      )?.toList()
    )
  }
}
