package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/partition-list/">Partition List</a>
 */
class PartitionList {
  fun partition(head: ListNode?, x: Int): ListNode? {
    val smallHead = ListNode(0)
    val bigHead = ListNode(0)
    var curr = head
    var currSmall = smallHead
    var currBig = bigHead

    while (curr != null) {
      if (curr.`val` < x) {
        currSmall.next = curr
        currSmall = currSmall.next!!
      } else {
        currBig.next = curr
        currBig = currBig.next!!
      }

      curr = curr.next
    }

    currBig.next = null
    currSmall.next = bigHead.next

    return smallHead.next
  }
}
