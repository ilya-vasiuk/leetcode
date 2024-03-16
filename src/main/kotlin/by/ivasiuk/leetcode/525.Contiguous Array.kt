package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/contiguous-array/">Contiguous Array</a>
 */
class ContiguousArray {
  fun findMaxLength(nums: IntArray): Int {
    val sums = mutableMapOf<Int, Int>()
    var sum = 0
    var max = 0

    for (i in nums.indices) {
      if (nums[i] == 0) sum-- else sum++

      if (sum == 0) {
        max = i + 1
      } else if (sums.containsKey(sum)) {
        max = maxOf(max, i - sums[sum]!!)
      } else {
        sums[sum] = i
      }
    }

    return max
  }
}
