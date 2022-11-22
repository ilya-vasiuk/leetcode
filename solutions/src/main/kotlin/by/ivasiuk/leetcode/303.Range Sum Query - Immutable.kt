package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/range-sum-query-immutable/">
 *   Range Sum Query - Immutable</a>
 */
class NumArray(nums: IntArray) {
  private val sums = IntArray(nums.size + 1)

  init {
    nums.indices.forEach { i ->
      sums[i + 1] = sums[i] + nums[i]
    }
  }

  fun sumRange(left: Int, right: Int): Int = sums[right + 1] - sums[left]
}
