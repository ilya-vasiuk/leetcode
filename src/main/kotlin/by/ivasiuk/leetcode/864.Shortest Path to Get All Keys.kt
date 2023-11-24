package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/shortest-path-to-get-all-keys/">
 *   Shortest Path to Get All Keys</a>
 */
class ShortestPathToGetAllKeys {
  fun shortestPathAllKeys(grid: Array<String>): Int {
    val m = grid.size
    val n = grid[0].length
    val s = (0..m * n).first { '@' == grid[it / n][it % n] }
    val visited = HashSet<Step>()
    val allKeys = (1 shl (grid.sumOf { it.count { it.isLowerCase() } })) - 1
    var steps = -1

    return with(ArrayDeque<Step>()) {
      add(Step(s / n, s % n, 0))

      while (isNotEmpty() && steps++ < m * n) {
        repeat(size) {
          val step = this.removeFirst()
          val (x, y, keys) = step

          if (keys == allKeys) {
            return steps - 1
          }

          if (x in 0 until m && y in 0 until n && visited.add(step)) {
            val cell = grid[x][y]

            if (cell != '#' && !(cell.isUpperCase() && 0 == (keys and bit(cell)))) {
              val newKeys = if (cell.isLowerCase()) (keys or bit(cell)) else keys

              DIRECTIONS.forEach { (dx, dy) ->
                add(Step(x + dx, y + dy, newKeys))
              }
            }
          }
        }
      }

      -1
    }
  }

  private fun bit(c: Char) = 1 shl (c - 'a')

  data class Step(val x: Int, val y: Int, val keys: Int)

  companion object {
    val DIRECTIONS = setOf(
      -1 to 0,
      0 to -1,
      1 to 0,
      0 to 1,
    )
  }
}
