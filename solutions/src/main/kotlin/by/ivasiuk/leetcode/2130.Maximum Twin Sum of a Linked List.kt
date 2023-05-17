package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/">
 *   Maximum Twin Sum of a Linked List</a>
 */
class MaximumTwinSumOfALinkedList {
  fun pairSum(head: ListNode?): Int {
    val values = LinkedList<Int>()
    var max = 0
    var current = head

    while (current != null) {
      values.offer(current.`val`)
      current = current.next
    }

    while (values.isNotEmpty()) {
      max = maxOf(max, values.pollLast() + values.pollFirst())
    }

    return max
  }
}
