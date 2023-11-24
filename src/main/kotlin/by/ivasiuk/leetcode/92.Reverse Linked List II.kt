package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/reverse-linked-list-ii/">
 *   Reverse Linked List II</a>
 */
class ReverseLinkedList2 {
  fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
    var curr = head
    var prev: ListNode? = null
    var mostLeft: ListNode? = null
    var mostRight: ListNode? = null
    var reversedPart: ListNode? = null
    var i = 1

    while (curr != null && i < left) {
      mostLeft = curr
      curr = curr.next
      i++
    }

    while (curr != null && i <= right) {
      reversedPart = curr
      val temp = curr.next

      if (mostRight == null) {
        mostRight = curr
      }

      curr.next = prev
      prev = curr
      curr = temp
      i++
    }

    mostRight?.next = curr

    return if (mostLeft == null) {
      reversedPart
    } else {
      mostLeft.next = reversedPart
      head
    }
  }
}
