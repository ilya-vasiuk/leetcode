package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/">
 *   Minimum Operations to Reduce X to Zero</a>
 */
class MinimumOperationsToReduceXToZero {
  fun minOperations(nums: IntArray, x: Int): Int {
    val targetSum = nums.sum() - x
    var windowSize = 0
    var currSum = 0
    var min = Int.MAX_VALUE

    for (i in nums.indices) {
      currSum += nums[i]
      windowSize++

      while (currSum > targetSum && windowSize > 0) {
        currSum -= nums[i - (windowSize--) + 1]
      }

      if (currSum == targetSum) {
        min = minOf(min, nums.size - windowSize)
      }
    }

    return min.takeIf { it < Int.MAX_VALUE } ?: -1
  }
}
