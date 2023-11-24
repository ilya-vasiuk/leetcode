package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-number-of-operations-to-make-array-continuous/">
 *   2009. Minimum Number of Operations to Make Array Continuous</a>
 */
class MinimumNumberOfOperationsToMakeArrayContinuous {
  fun minOperations(nums: IntArray): Int {
    val sortedNums = nums.toSet().sorted()
    var maxRange = 0

    for (i in sortedNums.indices) {
      val result = sortedNums.binarySearch(
        element = sortedNums[i] + nums.size - 1,
        fromIndex = i
      )

      val end = if (result < 0) -(result + 1) else result + 1
      maxRange = maxOf(maxRange, end - i)
    }

    return nums.size - maxRange
  }
}
