package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/merge-two-sorted-lists/">
 *   Merge Two Sorted Lists</a>
 */
class MergeTwoSortedLists {
  fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var current1 = list1
    var current2 = list2
    var tail: ListNode? = null
    var head: ListNode? = null

    while (current1 != null || current2 != null) {
      if (current1 != null && current2 != null) {
        if (current1.`val` <= current2.`val`) {
          if (tail == null) {
            head = current1
            tail = head
          } else {
            tail.next = current1
            tail = tail.next
          }

          current1 = current1.next
        } else {
          if (tail == null) {
            head = current2
            tail = head
          } else {
            tail.next = current2
            tail = tail.next
          }

          current2 = current2.next
        }
      } else if (current1 != null) {
        if (tail != null) {
          tail.next = current1
          break
        } else {
          return current1
        }
      } else {
        if (tail != null) {
          tail.next = current2
          break
        } else {
          return current2
        }
      }
    }

    return head
  }
}