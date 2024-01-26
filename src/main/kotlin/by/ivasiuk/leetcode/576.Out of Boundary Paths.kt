package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/out-of-boundary-paths/">
 *   Out of Boundary Paths</a>
 */
class OutOfBoundaryPaths {
  fun findPaths(m: Int, n: Int, maxMove: Int, startRow: Int, startColumn: Int): Int {
    val dp = Array(m) { Array(n) { arrayOfNulls<Long>(maxMove + 1) } }
    val directions = setOf(
      -1 to 0,
      1 to 0,
      0 to -1,
      0 to 1
    )

    fun visit(maxMove: Int, startRow: Int, startColumn: Int): Long =
      when {
        startRow < 0 || startColumn < 0 || startRow >= m || startColumn >= n -> 1
        maxMove < 1 -> 0
        dp[startRow][startColumn][maxMove] != null -> dp[startRow][startColumn][maxMove]!!
        else -> {
          dp[startRow][startColumn][maxMove] = directions.sumOf { (x, y) ->
            visit(maxMove - 1, startRow + x, startColumn + y)
          } % MODULO

          dp[startRow][startColumn][maxMove]!!
        }
      }


    return visit(maxMove, startRow, startColumn).toInt()
  }

  companion object {
    const val MODULO = 1_000_000_007
  }
}
