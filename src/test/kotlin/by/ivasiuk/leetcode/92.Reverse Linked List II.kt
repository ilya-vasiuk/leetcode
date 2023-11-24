package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class ReverseLinkedList2Test {
  private val solution = ReverseLinkedList2()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(1, 4, 3, 2, 5),
      actual = solution.reverseBetween(
        head = ListNode.fromList(1, 2, 3, 4, 5),
        left = 2,
        right = 4,
      )?.toList()
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(5),
      actual = solution.reverseBetween(
        head = ListNode.fromList(5),
        left = 1,
        right = 1,
      )?.toList()
    )
  }
}
