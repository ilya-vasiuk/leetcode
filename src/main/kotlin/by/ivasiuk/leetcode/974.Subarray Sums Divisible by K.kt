package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/subarray-sums-divisible-by-k/">
 *   Subarray Sums Divisible by K</a>
 */
class SubarraySumsDivisibleByK {
  fun subarraysDivByK(nums: IntArray, k: Int): Int {
    val map = mutableMapOf<Int, Int>()

    for (i in nums.indices) {
      if (i > 0) {
        nums[i] += nums[i - 1]
      }

      ((nums[i] % k + k) % k).let {
        map.putIfAbsent(it, 0)
        map.merge(it, 1) { a, b -> a + b }
      }
    }

    var result = map[0] ?: 0
    for (frequency in map.values) {
      result += frequency * (frequency - 1) / 2
    }

    return result
  }
}
