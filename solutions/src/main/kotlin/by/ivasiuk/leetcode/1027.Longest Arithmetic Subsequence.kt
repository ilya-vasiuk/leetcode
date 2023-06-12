package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/longest-arithmetic-subsequence/">
 *   Longest Arithmetic Subsequence</a>
 */
class LongestArithmeticSubsequence {
  fun solution(nums: IntArray): Int {
    val subs = Array<MutableMap<Int, Int>>(nums.size) { mutableMapOf() }
    var maxSub = 2

    nums.forEachIndexed { i, num ->
      repeat(i) {
        val diff = num - nums[it]
        val sub = 1 + (subs[it][diff] ?: 1)

        subs[i][diff] = sub
        maxSub = maxOf(maxSub, sub)
      }
    }

    return maxSub
  }
}
