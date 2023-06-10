package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/">
 *   Maximum Value at a Given Index in a Bounded Array</a>
 */
class MaximumValueAtAGivenIndexInABoundedArray {
  fun maxValue(n: Int, index: Int, maxSum: Int): Int {
    fun check(i: Long): Boolean =
      n + i + 2 * sum(i - 1) - sum(i - 1 - index) - sum(i - n + index) <= maxSum

    var left = 0L
    var right = maxSum.toLong()

    while (left <= right) {
      val mid = (left + right) / 2

      if (check(mid)) {
        left = mid + 1
      } else {
        right = mid - 1
      }
    }

    return left.toInt()
  }

  private fun sum(i: Long) = if (i < 0) 0 else i * (i + 1) / 2
}
