package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/linked-list-cycle-ii/">
 *   Linked List Cycle II</a>
 */
class LinkedListCycle2 {
  fun detectCycle(head: ListNode?): ListNode? {
    var current1 = head
    var current2 = head

    while (current2?.next != null) {
      current1 = current1?.next
      current2 = current2.next?.next

      if (current1 == current2) {
        break
      }
    }

    if (current2?.next == null) {
      return null
    }

    current2 = current1
    current1 = head

    while (current1 != current2) {
      current1 = current1!!.next
      current2 = current2!!.next
    }

    return current1
  }
}
