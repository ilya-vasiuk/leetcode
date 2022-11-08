package by.ivasiuk.leetcode

import java.util.*
import kotlin.math.abs

/**
 * @see <a href="https://leetcode.com/problems/make-the-string-great/">Make The String Great</a>
 */
class MakeTheStringGreat {
  fun makeGood(s: String): String {
    val stack = Stack<Char>()

    for (c in s) {
      if (stack.isEmpty()) {
        stack.push(c)
      } else if (abs(stack.peek() - c) == 32) {
        stack.pop()
      } else {
        stack.push(c)
      }
    }

    return stack.joinToString("")
  }
}
