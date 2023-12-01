package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/constrained-subsequence-sum/">
 *   Constrained Subsequence Sum</a>
 */
class ConstrainedSubsequenceSum {
  fun constrainedSubsetSum(nums: IntArray, k: Int): Int =
    with (ArrayDeque<Int>()) {
      for (i in nums.indices) {
        if (isNotEmpty() && first() < i - k) {
          removeFirst()
        }

        if (isNotEmpty()) {
          nums[i] += maxOf(0, nums[first()])
        }

        while (isNotEmpty() && nums[last()] < nums[i]) {
          removeLast()
        }

        addLast(i)
      }

      nums.max()
    }
}
