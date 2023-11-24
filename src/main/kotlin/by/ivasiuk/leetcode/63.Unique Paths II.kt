package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/unique-paths-ii/">Unique Paths II</a>
 */
class UniquePaths2 {
  fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
    val width = obstacleGrid[0].size
    val height = obstacleGrid.size

    if (obstacleGrid[height - 1][width - 1] == 1) {
      return 0
    }

    val dp = Array(height) { IntArray(width) }.also {
      it[height - 1][width - 1] = 1
    }

    for (i in obstacleGrid.indices.reversed()) {
      for (j in obstacleGrid[i].indices.reversed()) {
        if (obstacleGrid[i][j] != 1) {
          if (j + 1 < width) {
            dp[i][j] = dp[i][j] + dp[i][j + 1]
          }

          if (i + 1 < height) {
            dp[i][j] = dp[i][j] + dp[i + 1][j]
          }
        }
      }
    }

    return dp[0][0]
  }
}
