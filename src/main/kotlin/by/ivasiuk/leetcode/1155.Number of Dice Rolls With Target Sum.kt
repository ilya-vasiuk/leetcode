package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/">
 *   Number of Dice Rolls With Target Sum</a>
 */
class NumberOfDiceRollsWithTargetSum {
  fun numRollsToTarget(n: Int, k: Int, target: Int): Int {
    val dp = IntArray(target + 1).also {
      for (index in 1..minOf(k, target)) {
        it[index] = 1
      }
    }

    repeat(n - 1) {
      for (j in target downTo 1) {
        var sum = 0L

        for (dice in 1..k) {
          if (j - dice > 0) {
            sum += dp[j - dice]
          }
        }

        dp[j] = (sum % MODULO).toInt()
      }
    }

    return dp.last()
  }

  companion object {
    const val MODULO = 1_000_000_007
  }
}
