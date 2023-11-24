package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinStackTest {
  @Test
  fun example1() {
    val stack = MinStack()
    stack.push(-2)
    stack.push(0)
    stack.push(-3)
    assertEquals(-3, stack.getMin())
    stack.pop()
    assertEquals(0, stack.top())
    assertEquals(-2, stack.getMin())
  }
}