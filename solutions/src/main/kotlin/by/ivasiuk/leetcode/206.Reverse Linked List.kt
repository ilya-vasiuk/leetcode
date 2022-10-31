package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/reverse-linked-list/">
 *   Reverse Linked List</a>
 */
class ReverseLinkedList {
  private var newHead: ListNode? = null

  fun reverseList(head: ListNode?): ListNode? {
    if (head?.next == null) {
      return head
    }

    reverse(head, head.next)

    return newHead
  }

  private fun reverse(prev: ListNode?, current: ListNode?): ListNode? {
    val next: ListNode? = if (current?.next != null) {
      reverse(current, current.next)
    } else {
      newHead = current
      current
    }

    prev?.next = null
    next?.next = prev

    return next?.next

  }
}
