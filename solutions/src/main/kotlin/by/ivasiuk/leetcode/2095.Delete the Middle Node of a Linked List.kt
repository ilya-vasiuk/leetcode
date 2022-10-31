package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/">
 *   Delete the Middle Node of a Linked List</a>
 */
class DeleteTheMiddleNodeOfALinkedList {
  fun deleteMiddle(head: ListNode?): ListNode? =
    when (val chainSize = calcSize(head)) {
      1 -> null
      2 -> {
        head?.next = null
        head
      }

      else -> {
        var currentNode = head
        for (i in 0 until chainSize / 2) {
          currentNode = currentNode?.next
        }

        currentNode?.`val` = currentNode?.next!!.`val`
        currentNode.next = currentNode.next?.next

        head
      }
    }

  private fun calcSize(head: ListNode?): Int {
    var chainSize = 1
    var currentNode = head
    while (currentNode?.next != null) {
      currentNode = currentNode.next
      chainSize++
    }

    return chainSize
  }
}