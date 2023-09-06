package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.math.floor

/**
 * @see <a href="https://leetcode.com/problems/split-linked-list-in-parts/">
 *   Split Linked List in Parts</a>
 */
class SplitLinkedListInParts {
  fun splitListToParts(head: ListNode?, k: Int): Array<ListNode?> {
    var current = head
    var length = 0

    while (current != null) {
      length++
      current = current.next
    }

    val partLength = floor(length.toDouble() / k)
    val carry = length % k
    val result = arrayOfNulls<ListNode>(k)

    current = head
    for (i in 0 until k) {
      var currentLength = 0
      val part = current

      while (current != null && currentLength++ < partLength - 1 + if (i < carry) 1 else 0) {
        current = current.next
      }

      val temp = current?.next
      current?.apply { next = null }
      current = temp

      result[i] = part
    }

    return result
  }
}
