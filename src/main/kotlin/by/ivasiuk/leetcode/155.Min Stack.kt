package by.ivasiuk.leetcode

import java.util.Stack

/**
 * @see <a href="https://leetcode.com/problems/min-stack/">
 *   Min Stack</a>
 */
class MinStack {
  private val stack = Stack<StackNode>()

  fun push(`val`: Int) {
    stack.push(
      StackNode(
        value = `val`,
        min = if (stack.size > 0) minOf(`val`, stack.peek().min) else `val`
      )
    )
  }

  fun pop(): StackNode = stack.pop()

  fun top(): Int = stack.peek().value

  fun getMin(): Int = stack.peek().min

  data class StackNode(
    val value: Int,
    val min: Int,
  )
}