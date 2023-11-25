package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Sum of Absolute Differences in a Sorted Array</a>
 */
class SumOfAbsoluteDifferencesInASortedArray {
  fun getSumAbsoluteDifferences(nums: IntArray): IntArray {
    val totalSum = nums.sum()
    var prefixSum = 0
    val result = IntArray(nums.size)

    nums.forEachIndexed { index, num ->
      val suffixSum = totalSum - prefixSum

      result[index] = (num * index - prefixSum) + (suffixSum - num * (nums.size - index))
      prefixSum += nums[index]
    }

    return result
  }
}
