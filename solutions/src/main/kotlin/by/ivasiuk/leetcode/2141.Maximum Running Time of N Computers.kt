package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-running-time-of-n-computers/">
 *   Maximum Running Time of N Computers</a>
 */
class MaximumRunningTimeOfNComputers {
  fun maxRunTime(n: Int, batteries: IntArray): Long {
    if (n == batteries.size) {
      return batteries.min().toLong()
    }

    if (n == 1) {
      return batteries.sumOf { it.toLong() }
    }

    batteries.sortDescending()
    val reserve = batteries.drop(n).sumOf { it.toLong() }

    fun isPossible(m: Long): Boolean {
      var drained = 0L

      for (i in 0 until n) {
        if (batteries[i] < m) {
          drained += (batteries[i] - m)
        }
      }

      return (reserve + drained) >= 0L
    }

    var start = 1L
    var end = 100_000_000_000_000L
    var max = 1L

    while (start <= end) {
      val mid = (start + end) / 2

      if (isPossible(mid)) {
        start = mid + 1
        max = mid
      } else {
        end = mid - 1
      }
    }

    return max
  }
}
