package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/132-pattern/">132 Pattern</a>
 */
class Pattern132 {
  fun find132pattern(nums: IntArray): Boolean {
    if (nums.size < 3) {
      return false
    }

    val stack = Stack<Int>()
    var right = Int.MIN_VALUE

    for (i in nums.reversed()) {
      if (i < right) {
        return true
      }

      while (stack.isNotEmpty() && i > stack.peek()) {
        right = stack.pop()
      }

      stack.push(i)
    }

    return false
  }
}
