package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Number of Subsequences That Satisfy the Given Sum Condition</a>
 */
class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {
  fun numSubseq(nums: IntArray, target: Int): Int {
    nums.sort()

    val pow = IntArray(nums.size).also {
      it[0] = 1
      for (i in 1 until nums.size) {
        it[i] = it[i - 1] * 2 % MODULO
      }
    }

    var left = 0
    var right = nums.lastIndex
    var result = 0

    while (left <= right) {
      if (nums[left] + nums[right] > target) {
        right--
      } else {
        result = (result + pow[right - left]) % MODULO
        left++
      }
    }

    return result
  }

  companion object {
    const val MODULO = 1_000_000_007
  }
}
