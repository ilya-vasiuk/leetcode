package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class AddTwoNumbers2Test {
  private val solution = AddTwoNumbers2()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(7, 8, 0, 7),
      actual = solution.addTwoNumbers(
        l1 = ListNode.fromList(7, 2, 4, 3),
        l2 = ListNode.fromList(5, 6, 4)
      )?.toList()
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(8, 0, 7),
      actual = solution.addTwoNumbers(
        l1 = ListNode.fromList(2, 4, 3),
        l2 = ListNode.fromList(5, 6, 4)
      )?.toList()
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = listOf(0),
      actual = solution.addTwoNumbers(
        l1 = ListNode.fromList(0),
        l2 = ListNode.fromList(0)
      )?.toList()
    )
  }
}
