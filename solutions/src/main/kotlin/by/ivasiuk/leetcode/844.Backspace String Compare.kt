package by.ivasiuk.leetcode

import java.util.Stack

/**
 * @see <a href="https://leetcode.com/problems/backspace-string-compare/">
 *   Backspace String Compare</a>
 */
class BackspaceStringCompare {
  fun backspaceCompare(s: String, t: String): Boolean =
    backspace(s) == backspace(t)

  private fun backspace(s: String): String {
    val clean = Stack<Char>()

    for (c in s) {
      if (c == '#') {
        if (clean.isNotEmpty()) {
          clean.pop()
        }
      } else {
        clean.push(c)
      }
    }

    return clean.joinToString("")
  }
}
