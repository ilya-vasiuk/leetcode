package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/odd-even-linked-list/">
 *   Odd Even Linked List</a>
 */
class OddEvenLinkedList {
  fun oddEvenList(head: ListNode?): ListNode? {
    var odd = head
    var even = head?.next
    val evenHead = even

    while (odd?.next != null || even?.next != null) {
      if (odd != null) {
        odd.next = even?.next
        odd.next?.let { odd = even?.next }
      }
      if (even != null) {
        even.next = odd?.next
        even.next?.let { even = odd?.next }
      }
    }

    odd?.next = evenHead
    return head
  }
}