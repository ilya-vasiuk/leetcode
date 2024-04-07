package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/valid-parenthesis-string/">
 *   Valid Parenthesis String</a>
 */
class ValidParenthesisString {
  fun checkValidString(s: String): Boolean {
    val open = Stack<Int>()
    val wildcard = Stack<Int>()

    s.forEachIndexed { i, char ->
      when (char) {
        '(' -> open.push(i)
        '*' -> wildcard.push(i)
        ')' -> when {
          open.isNotEmpty() -> open.pop()
          wildcard.isNotEmpty() -> wildcard.pop()
          else -> return false
        }
      }
    }

    while (open.isNotEmpty()) {
      if (wildcard.isEmpty() || open.pop() > wildcard.pop()) {
        return false
      }
    }

    return true
  }
}
