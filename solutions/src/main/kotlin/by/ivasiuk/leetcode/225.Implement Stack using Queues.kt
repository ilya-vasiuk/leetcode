package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/implement-stack-using-queues/">Implement Stack using Queues</a>
 */
class MyStack {
  val first = LinkedList<Int>()
  val second = LinkedList<Int>()

  fun push(x: Int) {
    while (first.isNotEmpty()) {
      second.add(first.poll())
    }

    first.add(x)

    while (second.isNotEmpty()) {
      first.add(second.poll())
    }
  }

  fun pop(): Int = first.poll()

  fun top(): Int = first.peek()

  fun empty(): Boolean = first.isEmpty()
}
