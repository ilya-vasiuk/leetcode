package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumTwinSumOfALinkedListTest {
  private val solution = MaximumTwinSumOfALinkedList()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.pairSum(
        head = ListNode.fromList(5, 4, 2, 1)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 7,
      actual = solution.pairSum(
        head = ListNode.fromList(4, 2, 2, 3)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 100_001,
      actual = solution.pairSum(
        head = ListNode.fromList(1, 100_000)
      )
    )

  }
}
