package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals

class MiddleOfTheLinkedListTest {
  private val solution = MiddleOfTheLinkedList()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.middleNode(
        fast = ListNode.fromList(
          nums = intArrayOf(1, 2, 3, 4, 5)
        )
      )?.`val`
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.middleNode(
        fast = ListNode.fromList(
          nums = intArrayOf(1, 2, 3, 4, 5, 6)
        )
      )?.`val`
    )
  }
}
