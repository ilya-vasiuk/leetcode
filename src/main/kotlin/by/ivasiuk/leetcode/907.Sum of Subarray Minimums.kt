package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/sum-of-subarray-minimums/">
 *   Sum of Subarray Minimums</a>
 */
class SumOfSubarrayMinimums {
  fun sumSubarrayMins(arr: IntArray): Int {
    val modulo = 1_000_000_007
    val mins = Stack<Int>()
    val sums = IntArray(arr.size)

    for (i in arr.indices) {
      while (mins.isNotEmpty() && arr[mins.peek()] >= arr[i]) {
        mins.pop()
      }

      sums[i] = if (mins.isEmpty()) {
        (i + 1) * arr[i]
      } else {
        sums[mins.peek()] + (i - mins.peek()) * arr[i]
      }

      mins.push(i)
    }

    return sums.reduce { acc, i -> (acc + i) % modulo }
  }
}
