package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/">
 *   Widest Vertical Area Between Two Points Containing No Points</a>
 */
class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
  fun maxWidthOfVerticalArea(points: Array<IntArray>): Int {
    points.sortBy { it[0] }
    var max = 0

    for (i in 1 until points.size) {
      max = maxOf(max, points[i][0] - points[i-1][0])
    }

    return max
  }
}
