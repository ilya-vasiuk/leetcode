package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/">
 *   Minimum Remove to Make Valid Parentheses</a>
 */
class MinimumRemoveToMakeValidParentheses {
  fun minRemoveToMakeValid(s: String): String {
    val result = StringBuilder()
    var openCount = 0

    for (c in s) {
      when (c) {
        '(' -> {
          openCount++
          result.append(c)
        }

        ')' -> {
          if (openCount > 0) {
            openCount--
            result.append(c)
          }
        }

        else -> {
          result.append(c)
        }
      }
    }

    var i = result.length
    while (openCount > 0 && i-- > 0) {
      if (result[i] == '(') {
        result.deleteCharAt(i)
        openCount--
      }
    }

    return result.toString()
  }
}
