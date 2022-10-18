package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/merge-two-sorted-lists/">
 *   Merge Two Sorted Lists</a>
 */
class MergeTwoSortedLists {
  private var head: ListNode? = null
  private var current3: ListNode? = null

  fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var current1 = list1
    var current2 = list2

    while (current1 != null || current2 != null) {
      if (current1 != null && current2 != null) {
        if (current1.`val` <= current2.`val`) {
          putNode(current1.`val`)
          current1 = current1.next
        } else {
          putNode(current2.`val`)
          current2 = current2.next
        }
      } else if (current1 != null) {
        if (current3 != null) {
          current3?.next = current1
          break
        } else {
          return current1
        }
      } else {
        if (current3 != null) {
          current3?.next = current2
          break
        } else {
          return current2
        }
      }
    }

    return head
  }

  private fun putNode(`val`: Int) {
    val next = ListNode(`val`)

    if (current3 == null) {
      head = next
      current3 = head
    } else {
      current3?.next = next
      current3 = current3?.next
    }
  }
}