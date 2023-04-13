package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/validate-stack-sequences/">
 *   Validate Stack Sequences</a>
 */
class ValidateStackSequences {
  fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
    val stack = Stack<Int>()
    var i = 0

    pushed.forEach {
      stack.push(it)

      while (stack.isNotEmpty() && i < pushed.size && stack.peek() == popped[i]) {
        stack.pop()
        i++
      }
    }

    return i == pushed.size
  }
}
