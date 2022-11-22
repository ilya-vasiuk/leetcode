package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals

class ConvertBinaryNumberInALinkedListToIntegerTest {
  private val solution = ConvertBinaryNumberInALinkedListToInteger()

  @Test
  fun example1() {
    assertEquals(
      expected = 5,
      actual = solution.getDecimalValue(
        head = ListNode.fromList(
          nums = intArrayOf(1, 0, 1)
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.getDecimalValue(
        head = ListNode.fromList(
          nums = intArrayOf(0)
        )
      )
    )
  }
}
