package by.ivasiuk.leetcode

import kotlin.test.*

class ImplementQueueUsingStacksTest {
  @Test
  fun example1() {
    val queue = ImplementQueueUsingStacks.MyQueue()
    queue.push(1)
    queue.push(2)
    assertEquals(1, queue.peek())
    assertEquals(1, queue.pop())
    assertFalse(queue.empty())
  }
}