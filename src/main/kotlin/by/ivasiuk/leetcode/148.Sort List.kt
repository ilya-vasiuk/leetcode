package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/sort-list/">
 *   Sort List</a>
 */
class SortList {
  private val listMerger = MergeTwoSortedLists()

  fun sortList(head: ListNode?): ListNode? {
    if (head?.next == null) {
      return head
    }

    val mid = findMiddle(head)
    val left = sortList(head)
    val right = sortList(mid)

    return mergeTwoLists(left, right)
  }

  private fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    // Avoid copy/paste
    return listMerger.mergeTwoLists(list1, list2)
  }

  private fun findMiddle(head: ListNode?): ListNode? {
    var vhead = head
    var midPrev: ListNode? = null
    while (vhead?.next != null) {
      midPrev = if (midPrev == null) vhead else midPrev.next
      vhead = vhead.next!!.next
    }
    val mid = midPrev!!.next
    midPrev.next = null
    return mid
  }
}