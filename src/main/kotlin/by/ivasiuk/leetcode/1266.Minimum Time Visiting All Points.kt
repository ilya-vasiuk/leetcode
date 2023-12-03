package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-time-visiting-all-points/">
 *   Minimum Time Visiting All Points</a>
 */
class MinimumTimeVisitingAllPoints {
  fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
    var result = 0

    for (i in 1 until points.size) {
      val (x1, y1) = points[i - 1]
      val (x2, y2) = points[i]

      result += maxOf(maxOf(x1, x2) - minOf(x1, x2), maxOf(y1, y2) - minOf(y1, y2))
    }

    return result
  }
}
