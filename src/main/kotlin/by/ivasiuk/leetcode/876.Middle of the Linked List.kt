package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/middle-of-the-linked-list/">
 *   Middle of the Linked List</a>
 */
class MiddleOfTheLinkedList {
  fun middleNode(fast: ListNode?, slow: ListNode? = fast): ListNode? =
    fast?.next?.let { middleNode(it.next, slow!!.next) } ?: slow
}
