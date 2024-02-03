package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
class PartitionArrayForMaximumSum {
  fun maxSumAfterPartitioning(arr: IntArray, k: Int): Int {
    val dp = IntArray(arr.size + 1) { -1 }

    fun check(i: Int): Int {
      if (dp[i] > -1) {
        return dp[i]
      }

      var max = 0
      dp[i] = 0

      for (j in i until minOf(i + k, arr.size)) {
        max = maxOf(max, arr[j])
        dp[i] = maxOf(dp[i], max * (j - i + 1) + check(j + 1))
      }

      return dp[i]
    }

    return check(0)
  }
}
