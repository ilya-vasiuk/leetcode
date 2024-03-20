package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode


/**
 * @see <a href="https://leetcode.com/problems/merge-in-between-linked-lists/">
 *   Merge In Between Linked Lists</a>
 */
class MergeInBetweenLinkedLists {
  fun mergeInBetween(list1: ListNode?, a: Int, b: Int, list2: ListNode?): ListNode? {
    var aListNode: ListNode? = null
    var bListNode: ListNode? = null
    var dummyNode: ListNode? = ListNode(0).apply { next = list1 }

    var a = a
    var b = b + 1
    while (dummyNode!!.next != null) {
      a--
      b--
      dummyNode = dummyNode.next

      if (a == 0) {
        aListNode = dummyNode
      }

      if (b == 0) {
        bListNode = dummyNode
        break
      }
    }

    if (aListNode == null) {
      aListNode = list1
    }

    aListNode!!.next = list2

    var list2 = list2
    while (list2!!.next != null) {
      list2 = list2.next
    }

    list2.next = bListNode!!.next

    return list1
  }
}
