package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class LinkedListCycle2Test {
  private val solution = LinkedListCycle2()

  @Test
  fun example1() {
    val cycle = ListNode(2)

    assertEquals(
      expected = cycle,
      actual = solution.detectCycle(
        head = ListNode(3).apply {
          next = cycle.apply {
            next = ListNode(0).apply {
              next = ListNode(-4).apply {
                next = cycle
              }
            }
          }
        }
      )
    )
  }

  @Test
  fun example2() {
    val cycle = ListNode(1)

    assertEquals(
      expected = cycle,
      actual = solution.detectCycle(
        head = cycle.apply {
          next = ListNode(2).apply {
            next = cycle
          }
        }
      )
    )
  }

  @Test
  fun example3() {
    assertNull(
      actual = solution.detectCycle(
        head = ListNode(1)
      )
    )
  }
}
