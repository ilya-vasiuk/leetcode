package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/palindrome-linked-list/">
 *   Palindrome Linked List</a>
 */
class PalindromeLinkedList {
  fun isPalindrome(head: ListNode?): Boolean {
    val list = mutableListOf<Int>()
    var current = head

    while (current != null) {
      list.add(current.`val`)
      current = current.next
    }

    for (i in 0 until list.size / 2) {
      if (list[i] != list[list.size - i - 1]) {
        return false
      }
    }

    return true
  }
}