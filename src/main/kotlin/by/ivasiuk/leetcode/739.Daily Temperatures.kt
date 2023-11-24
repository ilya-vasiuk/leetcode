package by.ivasiuk.leetcode

import java.util.Stack

/**
 * @see <a href="https://leetcode.com/problems/daily-temperatures/">Daily Temperatures</a>
 */
class DailyTemperatures {
  fun dailyTemperatures(temperatures: IntArray): IntArray {
    val result = IntArray(temperatures.size)
    val stack = Stack<Int>()

    for (i in temperatures.size - 1 downTo 0) {
      while (stack.isNotEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
        stack.pop()
      }

      if (stack.isNotEmpty()) {
        result[i] = stack.peek() - i
      }

      stack.push(i)
    }

    return result
  }
}
