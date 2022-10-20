package by.ivasiuk.leetcode

import java.util.Stack

/**
 * @see <a href="https://leetcode.com/problems/implement-queue-using-stacks/">
 *   Implement Queue using Stacks</a>
 */
class ImplementQueueUsingStacks {
  class MyQueue {
    private val buffer = Stack<Int>()
    private val fakeQueue = Stack<Int>()

    fun push(x: Int) {
      while (!fakeQueue.empty()) {
        buffer.push(fakeQueue.pop())
      }
      buffer.push(x)
      while (!buffer.empty()) {
        fakeQueue.push(buffer.pop())
      }
    }

    fun pop(): Int {
      return fakeQueue.pop()
    }

    fun peek(): Int {
      return fakeQueue.peek()
    }

    fun empty(): Boolean {
      return fakeQueue.isEmpty()
    }
  }
}