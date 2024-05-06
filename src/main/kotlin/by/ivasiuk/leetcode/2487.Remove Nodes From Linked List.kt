package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/remove-nodes-from-linked-list/">
 *   Remove Nodes From Linked List</a>
 */
class RemoveNodesFromLinkedList {
  fun removeNodes(head: ListNode?): ListNode? {
    var temp = head

    while (head?.next != null) {
      val next = head.next?.next
      head.next?.next = temp
      temp = head.next
      head.next = next
    }

    while (temp != null) {
      val next = if (temp == head) null else temp.next

      if (temp.`val` >= (head?.next?.`val` ?: 0)) {
        if (temp == head) {
          return head
        }

        temp.next = head?.next
        head?.next = temp
      }

      temp = next
    }

    return head?.next
  }
}
