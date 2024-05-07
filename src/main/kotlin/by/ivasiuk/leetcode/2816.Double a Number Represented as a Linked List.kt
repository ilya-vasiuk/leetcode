package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
class DoubleANumberRepresentedAsALinkedList {
  fun doubleIt(head: ListNode?): ListNode? {
    val (carry, nextNode) = double(head!!)

    return if (carry == 0) {
      nextNode
    } else {
      ListNode(carry).apply { next = nextNode }
    }
  }

  fun double(node: ListNode): Pair<Int, ListNode> {
    val current = node.`val` * 2

    if (node.next == null) {
      return current  / 10 to ListNode(current % 10)
    }

    val (carry, nextNode) = double(node.next!!)

    return (current + carry) / 10 to ListNode((current + carry) % 10).apply { next = nextNode }
  }
}
