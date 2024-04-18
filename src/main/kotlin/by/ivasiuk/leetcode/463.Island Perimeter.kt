package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/island-perimeter/">Island Perimeter</a>
 */
class IslandPerimeter {
  fun islandPerimeter(grid: Array<IntArray>): Int {
    val row = grid.size
    val col = grid[0].size
    var result = 0

    for (i in 0 until row) {
      for (j in 0 until col) {
        if (grid[i][j] == 1) {
          result += 4

          if (i > 0 && grid[i - 1][j] == 1) {
            result -= 2
          }
          if (j > 0 && grid[i][j - 1] == 1) {
            result -= 2
          }
        }
      }
    }

    return result
  }
}
