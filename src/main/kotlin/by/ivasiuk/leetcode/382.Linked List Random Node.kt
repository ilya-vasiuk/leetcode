package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.random.Random

/**
 * @see <a href="https://leetcode.com/problems/linked-list-random-node/">
 *   Linked List Random Node</a>
 */
class LinkedListRandomNode(
  private val head: ListNode?
) {
  val size = head?.let {
    var current: ListNode? = it
    var size = 0

    while (current != null) {
      current = current.next
      size++
    }

    size
  } ?: 0

  fun getRandom(): Int {
    var current: ListNode? = head

    repeat(Random.nextInt(size)) {
      current = current!!.next
    }

    return current!!.`val`
  }
}
