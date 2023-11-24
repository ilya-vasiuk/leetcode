package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Monotonic Array</a>
 */
class MonotonicArray {
  fun isMonotonic(nums: IntArray): Boolean {
    val direction: (Int, Int) -> Boolean = when {
      nums.first() < nums.last() -> { a, b -> a <= b }
      nums.first() > nums.last() -> { a, b -> a >= b }
      else -> { a, b -> a == b }
    }

    for (index in 1 until nums.size) {
      if (!direction(nums[index - 1], nums[index])) {
        return false
      }
    }

    return true
  }
}
