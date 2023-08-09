package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimize-the-maximum-difference-of-pairs/">
 *   Minimize the Maximum Difference of Pairs</a>
 */
class MinimizeTheMaximumDifferenceOfPairs {
  fun minimizeMax(nums: IntArray, p: Int): Int {
    var results = IntArray(nums.size)
    var prevResults = IntArray(nums.size + 1)

    nums.sort()
    for (pairs in 1 .. p) {
      val range = nums.size - 2 * pairs downTo 2 * (p -  pairs)

      results[range.first + 1] = Int.MAX_VALUE

      for (i in range) {
        results[i] = minOf(results[i + 1], maxOf(nums[i + 1] - nums[i], prevResults[i + 2]))
      }

      val tmp = prevResults
      prevResults = results
      results = tmp
    }

    return prevResults.first()
  }
}
