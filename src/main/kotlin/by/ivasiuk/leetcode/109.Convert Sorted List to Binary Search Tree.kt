package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import by.ivasiuk.leetcode.common.TreeNode

/**
 * @see <a href="https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/">
 *   Convert Sorted List to Binary Search Tree</a>
 */
class ConvertSortedListToBinarySearchTree {
  fun sortedListToBST(head: ListNode?, tail: ListNode? = null): TreeNode? {
    if (head == tail) {
      return null
    }

    var slow = head
    var fast = head

    while (fast != tail && fast?.next != tail) {
      slow = slow?.next
      fast = fast?.next?.next
    }

    return TreeNode(slow!!.`val`).apply {
      left = sortedListToBST(head, slow)
      right = sortedListToBST(slow.next, tail)
    }
  }
}
