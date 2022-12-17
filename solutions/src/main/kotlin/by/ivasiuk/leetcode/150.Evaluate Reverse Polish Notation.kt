package by.ivasiuk.leetcode

import java.util.Stack

/**
 * @see <a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/">
 *   Evaluate Reverse Polish Notation</a>
 */
class EvaluateReversePolishNotation {
  fun evalRPN(tokens: Array<String>): Int =
    Stack<String>().let { stack ->
      tokens.forEach { stack.push(it) }
      process(stack)
    }

  private fun process(tokens: Stack<String>): Int =
    tokens.pop().let {
      it.toIntOrNull() ?: eval(it, process(tokens), process(tokens))
    }

  private fun eval(operator: String, a: Int, b: Int): Int =
    when (operator) {
      "*" -> b * a
      "/" -> b / a
      "+" -> b + a
      "-" -> b - a
      else -> throw IllegalStateException()
    }
}
