package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimize-maximum-of-array/">
 *   Minimize Maximum of Array</a>
 */
class MinimizeMaximumOfArray {
  fun minimizeArrayValue(nums: IntArray): Int {
    var result = 0L
    var prefixSum = 0L

    nums.forEachIndexed { i, num ->
      prefixSum += num
      result = maxOf(result, (prefixSum + i) / (i + 1))
    }

    return result.toInt()
  }
}
