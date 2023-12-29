package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/">
 *   Minimum Difficulty of a Job Schedule</a>
 */
class MinimumDifficultyOfAJobSchedule {
  fun minDifficulty(jobDifficulty: IntArray, d: Int): Int {
    val memo = HashMap<Triple<Int, Int, Int>, Int>()
    val n = jobDifficulty.size

    if (d > n) {
      return -1
    }

    fun dp(idx: Int, m: Int, p: Int): Int =
      when {
        idx == n && m == 0 -> 0
        m <= 0 -> MAX
        idx == n -> MAX
        else -> memo.getOrPut(Triple(idx, m, p)) {
          val max = maxOf(p, jobDifficulty[idx])

          minOf(dp(idx + 1, m - 1, -1) + max, dp(idx + 1, m, max))
        }
      }

    return dp(0, d, -1).takeIf { it < MAX } ?: -1
  }

  companion object {
    const val MAX = 10_000_000
  }
}
