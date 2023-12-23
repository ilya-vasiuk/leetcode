package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/path-crossing/">Path Crossing</a>
 */
class PathCrossing {
  fun isPathCrossing(path: String): Boolean {
    var x = 0
    var y = 0
    val visited = mutableSetOf<Pair<Int, Int>>()

    for (d in path) {
      visited.add(x to y)

      when (d) {
        'N' -> y++
        'W' -> x--
        'S' -> y--
        'E' -> x++
      }

      if (visited.contains(x to y)) {
        return true
      }
    }

    return false
  }
}
