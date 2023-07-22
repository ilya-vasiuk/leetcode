package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/knight-probability-in-chessboard/">
 *   Knight Probability in Chessboard</a>
 */
class KnightProbabilityInChessboard {
  private val steps = setOf(-2 to -1, -2 to 1, -1 to -2, -1 to 2, 1 to -2, 1 to 2, 2 to -1, 2 to 1)

  fun knightProbability(n: Int, k: Int, row: Int, col: Int): Double {
    val cache = Array(n) { Array(n) { DoubleArray(k + 1) { -1.0 } } }

    fun check(row: Int, col: Int, k: Int): Double =
      when {
        row !in 0 until n || col !in 0 until n -> 0.0
        k == 0 -> 1.0
        cache[row][col][k] != -1.0 -> cache[row][col][k]
        else -> steps
          .fold(0.0) { acc, (dr, dc) -> acc + check(row + dr, col + dc, k - 1) / 8 }
          .apply { cache[row][col][k] = this }
      }

    return check(row, col, k)
  }
}
