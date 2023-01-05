package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/">
 *   Minimum Number of Arrows to Burst Balloons</a>
 */
class MinimumNumberOfArrowsToBurstBalloons {
  fun findMinArrowShots(points: Array<IntArray>): Int {
    points.sortBy { it[1] }

    var result = 1
    var prev = 0

    for (current in 1 until points.size) {
      if (points[current][0] > points[prev][1]) {
        result++
        prev = current
      }
    }

    return result
  }
}
