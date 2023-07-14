package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/">
 *   Longest Arithmetic Subsequence of Given Difference</a>
 */
class LongestArithmeticSubsequenceOfGivenDifference {
  fun longestSubsequence(arr: IntArray, difference: Int): Int {
    val memo = mutableMapOf<Int, Int>()
    var result = 0

    for (num in arr) {
      with(1 + (memo[num - difference] ?: 0)) {
        memo[num] = this
        result = maxOf(this, result)
      }
    }

    return result
  }
}
