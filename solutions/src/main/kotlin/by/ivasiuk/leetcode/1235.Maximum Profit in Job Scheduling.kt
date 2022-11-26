package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/maximum-profit-in-job-scheduling/">
 *   Maximum Profit in Job Scheduling</a>
 */
class MaximumProfitInJobScheduling {
  fun jobScheduling(startTime: IntArray, endTime: IntArray, profit: IntArray): Int {
    val jobs = startTime.indices
      .map { Job(startTime[it], endTime[it], profit[it]) }
      .toTypedArray()
      .sortedWith { j1, j2 -> j1.endTime - j2.endTime }

    val result = IntArray(jobs.size)
    result[0] = jobs[0].profit

    for (i in 1 until jobs.size) {
      result[i] = maxOf(result[i-1], jobs[i].profit)

      for (j in i - 1 downTo 0) {
        if (jobs[j].endTime <= jobs[i].startTime) {
          result[i] = maxOf(result[i], jobs[i].profit + result[j])
          break
        }
      }
    }

    return result.last()
  }

  data class Job(
    val startTime: Int,
    val endTime: Int,
    val profit: Int,
  )
}
