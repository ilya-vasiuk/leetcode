package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/subarray-product-less-than-k/">
 *   Subarray Product Less Than K</a>
 */
class SubarrayProductLessThanK {
  fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
    if (k <= 1) {
      return 0
    }

    var result = 0
    var prod = 1
    var left = 0

    for (right in nums.indices) {
      prod *= nums[right]

      while (prod >= k) {
        prod /= nums[left++]
      }

      result += right - left + 1
    }

    return result
  }
}