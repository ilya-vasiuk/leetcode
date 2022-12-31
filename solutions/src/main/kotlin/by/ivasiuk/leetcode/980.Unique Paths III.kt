package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/unique-paths-iii/">Unique Paths III</a>
 */
class UniquePaths3 {
  fun uniquePathsIII(grid: Array<IntArray>): Int {
    var zeros = 0
    var x = 0
    var y = 0

    for (i in grid.indices) {
      for (j in grid[0].indices) {
        if (grid[i][j] == 0) {
          zeros++
        } else if (grid[i][j] == 1) {
          x = i
          y = j
        }
      }
    }
    return check(grid, x, y, zeros)
  }

  private fun check(grid: Array<IntArray>, x: Int, y: Int, zeros: Int): Int {
    if (x < 0 || y < 0 || x >= grid.size || y >= grid[0].size || grid[x][y] == -1) {
      return 0
    }
    if (grid[x][y] == 2) {
      return if (zeros == -1) 1 else 0
    }

    grid[x][y] = -1

    val totalCount = check(grid, x + 1, y, zeros - 1) +
        check(grid, x, y + 1, zeros - 1) +
        check(grid, x - 1, y, zeros - 1) +
        check(grid, x, y - 1, zeros - 1)

    grid[x][y] = 0

    return totalCount
  }
}
