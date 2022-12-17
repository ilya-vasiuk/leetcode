package by.ivasiuk.leetcode

import java.util.Stack

/**
 * @see <a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/">
 *   Evaluate Reverse Polish Notation</a>
 */
class EvaluateReversePolishNotation {
  fun evalRPN(tokens: Array<String>): Int {
    val stack = Stack<String>()
    tokens.forEach { stack.push(it) }

    return process(stack)
  }

  private fun process(tokens: Stack<String>): Int =
    when (val current = tokens.pop()) {
      "*" -> process(tokens) * process(tokens)
      "/" -> {
        val a = process(tokens)
        val b = process(tokens)
        b / a
      }
      "+" -> process(tokens) + process(tokens)
      "-" -> process(tokens) - process(tokens)
      else -> current.toIntOrNull()!!
    }
}
