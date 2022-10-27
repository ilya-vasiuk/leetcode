package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/">
 *   Remove Duplicates from Sorted List II</a>
 */
class RemoveDuplicatesFromSortedList2 {
  fun deleteDuplicates(head: ListNode?): ListNode? {
    val resultHead = ListNode(-1).also { it.next = head }
    var prev: ListNode? = resultHead
    var current = head

    while (current != null) {
      if (current.next?.`val` == current.`val`) {
        while (current?.next?.`val` == current?.`val`) {
          current = current?.next
        }

        prev?.next = current?.next
      } else {
        prev = prev?.next
      }

      current = current?.next
    }

    return resultHead.next
  }
}