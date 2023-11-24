package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/number-of-zero-filled-subarrays/">
 *   Number of Zero-Filled Subarrays</a>
 */
class NumberOfZeroFilledSubarrays {
  fun zeroFilledSubarray(nums: IntArray): Long {
    var result = 0L
    var zeroes = 0

    for (num in nums) {
      if (num == 0) {
        result += ++zeroes
      } else {
        zeroes = 0
      }
    }

    return result
  }
}
