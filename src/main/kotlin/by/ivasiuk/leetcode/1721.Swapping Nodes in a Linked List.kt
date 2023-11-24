package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/swapping-nodes-in-a-linked-list/">
 *   Swapping Nodes in a Linked List</a>
 */
class SwappingNodesInALinkedList {
  fun swapNodes(head: ListNode?, k: Int): ListNode? {
    var left = head!!
    var right = head

    for (i in 1 until k) {
      left = left.next!!
    }

    var curr = left

    while (curr.next != null) {
      curr = curr.next!!
      right = right?.next
    }

    val temp = left.`val`
    left.`val` = right!!.`val`
    right.`val` = temp

    return head
  }
}