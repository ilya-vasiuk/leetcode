package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/">
 *   Remove Zero Sum Consecutive Nodes from Linked List</a>
 */
class RemoveZeroSumConsecutiveNodesFromLinkedList {
  fun removeZeroSumSublists(head: ListNode?): ListNode? {
    val dummy = ListNode(0).apply {
      next = head
    }

    var prev: ListNode? = dummy
    var cur: ListNode?

    while (prev != null) {
      var sum = 0
      cur = prev.next

      while (cur != null) {
        sum += cur.`val`

        if (sum == 0) {
          prev.next = cur.next
        }

        cur = cur.next
      }

      prev = prev.next
    }

    return dummy.next
  }
}
