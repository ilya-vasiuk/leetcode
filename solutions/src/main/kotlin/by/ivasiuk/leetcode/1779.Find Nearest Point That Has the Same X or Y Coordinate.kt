package by.ivasiuk.leetcode

import kotlin.math.abs

/**
 * @see <a href="https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/">
 *   Find Nearest Point That Has the Same X or Y Coordinate</a>
 */
class FindNearestPointThatHasTheSameXOrYCoordinate {
  fun nearestValidPoint(x: Int, y: Int, points: Array<IntArray>): Int =
    points.withIndex()
      .filter { (_, point) -> point[0] == x || point[1] == y }
      .minByOrNull { (_, point) -> abs(point[0] - x) + abs(point[1] - y) }
      ?.index ?: -1
}
