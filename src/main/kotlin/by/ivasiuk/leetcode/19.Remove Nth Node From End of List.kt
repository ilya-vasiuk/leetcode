package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">
 *   Remove Nth Node From End of List</a>
 */
class RemoveNthNodeFromEndOfList {
  fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val node = getNth(head, n)
    if (node.second == head) {
      return head?.next
    }

    var current = head
    while (current?.next != node.second) {
      current = current?.next
    }
    current?.next = current?.next?.next

    return head
  }

  private fun getNth(current: ListNode?, n: Int): Pair<Int, ListNode?> {
    return if (current?.next != null) {
      val q = getNth(current.next, n)
      if (q.first == n) {
        q
      } else {
        Pair(q.first + 1, current)
      }
    } else {
      Pair(1, current)
    }
  }
}