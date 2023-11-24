package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-time-to-complete-trips/">
 *   Minimum Time to Complete Trips</a>
 */
class MinimumTimeToCompleteTrips {
  fun minimumTime(time: IntArray, totalTrips: Int): Long {
    var left = 1L
    var right = time.max().toLong() * totalTrips
    var result = right

    while (left <= right) {
      val mid = (left + right) / 2

      if (time.sumOf { mid / it } >= totalTrips) {
        result = mid
        right = mid - 1
      } else {
        left = mid + 1
      }
    }

    return result
  }
}
