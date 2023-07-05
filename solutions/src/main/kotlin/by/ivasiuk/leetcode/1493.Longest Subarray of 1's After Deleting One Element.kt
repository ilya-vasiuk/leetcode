package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/">
 *   Longest Subarray of 1's After Deleting One Element</a>
 */
class LongestSubarrayOf1sAfterDeletingOneElement {
  fun longestSubarray(nums: IntArray): Int {
    var left = 0
    var zeroes = 0
    var result = 0

    nums.forEachIndexed { right, x ->
      zeroes += 1 - x

      while (zeroes > 1) {
        zeroes -= 1 - nums[left++]
      }

      result = maxOf(result, right - left)
    }

    return result
  }
}
