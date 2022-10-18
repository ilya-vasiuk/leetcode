package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/where-will-the-ball-fall/">
 *   Where Will the Ball Fall</a>
 */
class WhereWillTheBallFall {
  fun findBall(grid: Array<IntArray>): IntArray {
    val n = grid[0].size
    val result = IntArray(n)
    for (ball in 0 until n) {
      var j = ball

      for (i in grid.indices) {
        if (grid[i][j] == -1 && j != 0 && grid[i][j - 1] == -1) {
          j--
        } else if (grid[i][j] == 1 && j != n - 1 && grid[i][j + 1] == 1) {
          j++
        } else {
          result[ball] = -1
          break
        }

        result[ball] = j
      }
    }

    return result
  }
}