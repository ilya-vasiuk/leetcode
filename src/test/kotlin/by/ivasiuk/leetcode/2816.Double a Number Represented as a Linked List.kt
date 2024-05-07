package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class DoubleANumberRepresentedAsALinkedListTest {
  private val solution = DoubleANumberRepresentedAsALinkedList()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(3, 7, 8),
      actual = solution.doubleIt(ListNode.fromList(1, 8, 9))?.toList()
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(1, 9, 9, 8),
      actual = solution.doubleIt(ListNode.fromList(9, 9, 9))?.toList()
    )
  }
}
