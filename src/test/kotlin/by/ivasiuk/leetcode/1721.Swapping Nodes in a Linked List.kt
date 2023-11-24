package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class SwappingNodesInALinkedListTest {
  private val solution = SwappingNodesInALinkedList()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(1, 4, 3, 2, 5),
      actual = solution.swapNodes(
        head = ListNode.fromList(1, 2, 3, 4, 5),
        k = 2
      )!!.toList()
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(7, 9, 6, 6, 8, 7, 3, 0, 9, 5),
      actual = solution.swapNodes(
        head = ListNode.fromList(7, 9, 6, 6, 7, 8, 3, 0, 9, 5),
        k = 5
      )!!.toList()
    )
  }
}
