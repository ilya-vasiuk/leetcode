package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.*

class RemoveLinkedListElementsTest {
  private val solution = RemoveLinkedListElements()

  @Test
  fun example1() {
    val head = ListNode.fromList(1, 2, 6, 3, 4, 5, 6)
    val result = solution.removeElements(head, 6)

    assertContentEquals(listOf(1, 2, 3, 4, 5), result?.toList())
  }

  @Test
  fun example2() {
    assertNull(solution.removeElements(null, 1))
  }

  @Test
  fun example3() {
    val head = ListNode.fromList(7, 7, 7, 7)

    assertNull(solution.removeElements(head, 7))
  }
}