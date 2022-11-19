package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/check-if-it-is-a-straight-line/">
 *   Check If It Is a Straight Line</a>
 */
class CheckIfItIsAStraightLine {
  fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
    val x1 = coordinates[1][0]
    val y1 = coordinates[1][1]
    val deltaX = x1 - coordinates[0][0]
    val deltaY = y1 - coordinates[0][1]

    return coordinates.all { coordinate -> deltaX * (coordinate[1] - y1) == deltaY * (coordinate[0] - x1) }
  }
}