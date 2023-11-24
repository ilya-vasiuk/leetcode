package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/maximize-score-after-n-operations/">
 *   Maximize Score After N Operations</a>
 */
class MaximizeScoreAfterNOperations {
  fun maxScore(nums: IntArray): Int {
    val n = nums.size
    val gcdMatrix = Array(n) { IntArray(n) }
    val dp = IntArray(1 shl n)

    for (i in 0 until n) {
      for (j in i + 1 until n) {
        gcdMatrix[j][i] = gcd(nums[i], nums[j])
        gcdMatrix[i][j] = gcdMatrix[j][i]
      }
    }

    for (state in 1 until (1 shl n)) {
      val cnt = Integer.bitCount(state)

      if (cnt % 2 == 0) {
        for (i in 0 until n) {
          if (state and (1 shl i) != 0) {
            for (j in i + 1 until n) {
              if (state and (1 shl j) != 0) {
                val nextState = state xor (1 shl i) xor (1 shl j)

                dp[state] = maxOf(dp[state], dp[nextState] + cnt / 2 * gcdMatrix[i][j])
              }
            }
          }
        }
      }
    }

    return dp[(1 shl n) - 1]
  }

  private fun gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}
