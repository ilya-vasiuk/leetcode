package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import by.ivasiuk.leetcode.common.ListNode

class AddTwoNumbersTest {
  private val solution = AddTwoNumbers()

  @Test
  fun example1() {
    val l1 = ListNode(2).also {
      it.next = ListNode(4).also {
        it.next = ListNode(3)
      }
    }

    val l2 = ListNode(5).also {
      it.next = ListNode(6).also {
        it.next = ListNode(4)
      }
    }

    val result = solution.addTwoNumbers(l1, l2)
    assertContentEquals(listOf(7, 0, 8), result?.toList())
  }

  @Test
  fun example2() {
    val l1 = ListNode(0)
    val l2 = ListNode(0)

    val result = solution.addTwoNumbers(l1, l2)
    assertContentEquals(listOf(0), result?.toList())
  }

  @Test
  fun example3() {
    val l1 = ListNode(9).also {
      it.next = ListNode(9).also {
        it.next = ListNode(9).also {
          it.next = ListNode(9).also {
            it.next = ListNode(9).also {
              it.next = ListNode(9).also {
                it.next = ListNode(9)
              }
            }
          }
        }
      }
    }

    val l2 = ListNode(9).also {
      it.next = ListNode(9).also {
        it.next = ListNode(9).also {
          it.next = ListNode(9)
        }
      }
    }

    val result = solution.addTwoNumbers(l1, l2)
    assertContentEquals(listOf(8, 9, 9, 9, 0, 0, 0, 1), result?.toList())
  }
}