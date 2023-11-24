package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-replacements-to-sort-the-array/">
 *   Minimum Replacements to Sort the Array</a>
 */
class MinimumReplacementsToSortTheArray {
  fun minimumReplacement(nums: IntArray): Long {
    var numberOfOperations = 0L
    var prevBound = nums[nums.size - 1].toLong()

    for (i in nums.size - 2 downTo 0) {
      val n = nums[i].toLong()
      val numberOfTimes = (n + prevBound - 1) / prevBound

      numberOfOperations += numberOfTimes - 1
      prevBound = n / numberOfTimes
    }

    return numberOfOperations
  }
}
