package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/delete-node-in-a-linked-list/">
 *   Delete Node in a Linked List</a>
 */
class DeleteNodeInALinkedList {
  fun deleteNode(node: ListNode?) {
    node?.`val` = node?.next?.`val`!!
    node.next = node.next?.next
  }

  class ListNode(var `val`: Int) {
    var next: ListNode? = null
  }
}