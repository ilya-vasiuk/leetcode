package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/middle-of-the-linked-list/">
 *   Middle of the Linked List</a>
 */
class MiddleOfTheLinkedList {
  fun middleNode(head: ListNode?): ListNode? {
    var slow = head
    var fast = head?.next

    while (fast != null) {
      slow = slow?.next
      fast = fast.next?.next
    }

    return slow
  }
}
