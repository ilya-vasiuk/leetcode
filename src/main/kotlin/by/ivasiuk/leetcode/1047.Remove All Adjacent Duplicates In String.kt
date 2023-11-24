package by.ivasiuk.leetcode

import java.util.Stack

/**
 * @see <a href="https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/">
 *   Remove All Adjacent Duplicates In String</a>
 */
class RemoveAllAdjacentDuplicatesInString {
  fun removeDuplicates(s: String): String {
    val result = Stack<Char>()

    for (c in s) {
      if (result.isEmpty()) {
        result.push(c)
      } else if (result.peek() == c) {
        result.pop()
      } else {
        result.push(c)
      }
    }

    return result.joinToString("")
  }
}
