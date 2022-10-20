package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">
 *   Valid Parentheses</a>
 */
class ValidParentheses {
  fun isValid(s: String): Boolean {
    val stack = CharArray(s.length)
    var tail = -1

    for (c in s) {
      if (PAIRS.keys.contains(c)) {
        if (tail == -1 || stack[tail] != PAIRS[c]) {
          return false
        } else {
          tail--
        }
      } else {
        stack[++tail] = c
      }
    }

    return tail == -1
  }

  companion object {
    private val PAIRS = mapOf(
      '}' to '{',
      ']' to '[',
      ')' to '(',
    )
  }
}