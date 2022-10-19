package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/">
 *    Remove Duplicates from Sorted List</a>
 */
class RemoveDuplicatesFromSortedList {
  fun deleteDuplicates(head: ListNode?): ListNode? {
    var current = head

    while (current != null) {
      if (current.next?.`val` == current.`val`) {
        current.next = current.next?.next
      } else {
        current = current.next
      }
    }

    return head
  }
}