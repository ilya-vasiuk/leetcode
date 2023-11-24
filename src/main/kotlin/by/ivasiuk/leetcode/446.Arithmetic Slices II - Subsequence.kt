package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/arithmetic-slices-ii-subsequence/">
 *   Arithmetic Slices II - Subsequence</a>
 */
class ArithmeticSlices2Subsequence {
  fun numberOfArithmeticSlices(nums: IntArray): Int {
    val count = Array<MutableMap<Long, Int>>(nums.size) { mutableMapOf() }
    var result = 0

    for (i in nums.indices) {
      count[i] = HashMap(i)

      for (j in 0 until i) {
        val delta = nums[j].toLong() - nums[i].toLong()

        if (delta in Int.MIN_VALUE + 1 until Int.MAX_VALUE) {
          val current = count[j][delta] ?: 0
          count[i][delta] = (count[i][delta] ?: 0) + current + 1
          result += current
        }
      }
    }

    return result
  }
}
