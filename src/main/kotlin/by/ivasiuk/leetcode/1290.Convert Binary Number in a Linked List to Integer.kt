package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/">
 *   Convert Binary Number in a Linked List to Integer</a>
 */
class ConvertBinaryNumberInALinkedListToInteger {
  fun getDecimalValue(head: ListNode?): Int {
    var result = 0
    var current = head

    while (current != null) {
      result = result * 2 + current.`val`
      current = current.next
    }

    return result
  }
}
