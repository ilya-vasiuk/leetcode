package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.*

class RemoveLinkedListElementsTest {
  private val solution = RemoveLinkedListElements()

  @Test
  fun example1() {
    val head = ListNode(1).also {
      it.next = ListNode(2).also {
        it.next = ListNode(6).also {
          it.next = ListNode(3).also {
            it.next = ListNode(4).also {
              it.next = ListNode(5).also {
                it.next = ListNode(6)
              }
            }
          }
        }
      }
    }

    val result = solution.removeElements(head, 6)
    assertContentEquals(listOf(1, 2, 3, 4, 5), result?.toList())
  }

  @Test
  fun example2() {
    assertNull(solution.removeElements(null, 1))
  }

  @Test
  fun example3() {
    val head = ListNode(7).also {
      it.next = ListNode(7).also {
        it.next = ListNode(7).also {
          it.next = ListNode(7)
        }
      }
    }

    assertNull(solution.removeElements(head, 7))
  }
}