package by.ivasiuk.leetcode

import java.util.Stack

/**
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">
 *   Valid Parentheses</a>
 */
class ValidParentheses {
  fun isValid(s: String): Boolean {
    val stack = Stack<Char>()

    fun isPaired(pair: Char) =
      stack.isNotEmpty() && stack.pop() == pair

    for (c in s) {
      when (c) {
        '{', '[', '(' -> stack.push(c)
        '}' -> if (!isPaired('{')) return false
        ')' -> if (!isPaired('(')) return false
        ']' -> if (!isPaired('[')) return false
      }
    }

    return stack.isEmpty()
  }
}