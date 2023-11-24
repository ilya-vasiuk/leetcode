package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/remove-linked-list-elements/">
 *   Remove Linked List Elements</a>
 */
class RemoveLinkedListElements {
  fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    var current = head
    while (current?.`val` == `val`) {
      current = current.next
    }

    val newHead = current
    while (current?.next != null) {
      if (current.next?.`val` == `val`) {
        current.next = current.next?.next
      } else {
        current = current.next
      }
    }

    return newHead
  }
}