package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/">
 *   Maximum Nesting Depth of the Parentheses</a>
 */
class MaximumNestingDepthOfTheParentheses {
  fun maxDepth(s: String): Int {
    var max = 0
    var current = 0

    for (c in s) {
      when (c) {
        '(' -> {
          current++
          max = maxOf(max, current)
        }
        ')' -> current--
      }
    }

    return max
  }
}
