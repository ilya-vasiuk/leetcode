package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PalindromeLinkedListTest {
  private val solution = PalindromeLinkedList()

  @Test
  fun example1() {
    val head = ListNode.fromList(1, 2, 2, 1)

    assertTrue {
      solution.isPalindrome(head)
    }
  }

  @Test
  fun example2() {
    val head = ListNode.fromList(1, 2)

    assertFalse {
      solution.isPalindrome(head)
    }
  }
}