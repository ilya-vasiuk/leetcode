package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode


/**
 * @see <a href="https://leetcode.com/problems/swap-nodes-in-pairs/">
 *   Swap Nodes in Pairs</a>
 */
class SwapNodesInPairs {
  fun swapPairs(head: ListNode?): ListNode? {
    val dummy = ListNode(0).apply {
      next = head
    }

    var prev = dummy
    var curr = head

    while (curr?.next != null) {
      prev.next = curr.next
      curr.next = prev.next?.next
      prev.next?.next = curr

      prev = curr
      curr = curr.next
    }

    return dummy.next
  }
}
