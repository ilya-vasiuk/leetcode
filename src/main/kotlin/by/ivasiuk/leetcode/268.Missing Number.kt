package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/missing-number/">Missing Number</a>
 */
class MissingNumber {
  fun missingNumber(nums: IntArray): Int =
    nums.indices.fold(nums.size) { acc, i -> acc + i - nums[i] }
}
