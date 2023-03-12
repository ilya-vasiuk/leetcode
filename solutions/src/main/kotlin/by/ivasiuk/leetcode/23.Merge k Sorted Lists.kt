package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import java.util.PriorityQueue

/**
 * @see <a href="https://leetcode.com/problems/merge-k-sorted-lists/">
 *   Merge k Sorted Lists</a>
 */
class MergeKSortedLists {
  fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    var head: ListNode? = null
    var tail: ListNode? = null
    val queue = PriorityQueue<ListNode> { a, b -> a.`val` - b.`val` }
    lists.filterNotNull().forEach { queue.offer(it) }

    while (queue.isNotEmpty()) {
      val minNode = queue.poll()

      if (head == null) {
        head = minNode
        tail = minNode
      } else {
        tail!!.next = minNode
        tail = tail.next
      }

      minNode.next?.let { queue.offer(it) }
    }

    return head
  }
}
