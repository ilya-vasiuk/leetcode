package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/linked-list-cycle/">
 *   Linked List Cycle</a>
 */
class LinkedListCycle {
  fun hasCycle(head: ListNode?): Boolean {
    var current1 = head
    var current2 = head

    while (current2?.next != null) {
      current1 = current1?.next
      current2 = current2.next?.next

      if (current1 == current2) {
        return true
      }
    }

    return false
  }
}