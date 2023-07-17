package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import java.util.Stack

/**
 * @see <a href="https://leetcode.com/problems/add-two-numbers-ii/">
 *   Add Two Numbers II</a>
 */
class AddTwoNumbers2 {
  fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val num1 = Stack<Int>().apply {
      var current = l1
      while (current != null) {
        push(current.`val`)
        current = current.next
      }
    }

    val num2 = Stack<Int>().apply {
      var current = l2
      while (current != null) {
        push(current!!.`val`)
        current = current!!.next
      }
    }
    var result: ListNode? = null
    var carry = 0
    while (num1.isNotEmpty() || num2.isNotEmpty() || carry > 0) {
      val a = if (num1.isEmpty()) 0 else num1.pop()
      val b = if (num2.isEmpty()) 0 else num2.pop()

      val buff = result
      result = ListNode((a + b + carry) % 10).apply {
        next = buff
      }

      carry = (a + b + carry) / 10
    }

    return result
  }
}
