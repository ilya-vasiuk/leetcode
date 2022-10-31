package by.ivasiuk.leetcode

import kotlin.math.max

/**
 * @see <a href="https://leetcode.com/problems/rotting-oranges/">
 *   Rotting Oranges</a>
 */
class RottingOranges {
  fun orangesRotting(grid: Array<IntArray>): Int {
    val m = grid.size
    val n = grid[0].size
    val minutes = Array(m) { IntArray(n) { -1 } }

    for (i in 0 until m) {
      for (j in 0 until n) {
        if (grid[i][j] == 2) {
          rot(i, j, m, n, grid, minutes)
        }
      }
    }

    var minute = 0
    for (i in 0 until m) {
      for (j in 0 until n) {
        if (grid[i][j] == 1) {
          if (minutes[i][j] == -1) {
            return -1
          } else {
           minute = max(minute, minutes[i][j])
          }
        }
      }
    }

    return minute
  }

  private fun rot(
    i: Int,
    j: Int,
    m: Int,
    n: Int,
    grid: Array<IntArray>,
    minutes: Array<IntArray>,
    minute: Int = 0
  ) {
    if (
      i in 0 until m &&
      j in 0 until n &&
      grid[i][j] != 0 &&
      (minutes[i][j] == -1 || minute < minutes[i][j])
    ) {
      minutes[i][j] = minute
      rot(i - 1, j, m, n, grid, minutes, minute + 1)
      rot(i, j + 1, m, n, grid, minutes, minute + 1)
      rot(i + 1, j, m, n, grid, minutes, minute + 1)
      rot(i, j - 1, m, n, grid, minutes, minute + 1)
    }
  }
}