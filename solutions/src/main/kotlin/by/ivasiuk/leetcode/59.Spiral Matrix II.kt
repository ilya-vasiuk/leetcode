package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/spiral-matrix-ii/">
 *   Spiral Matrix II</a>
 */
class SpiralMatrix2 {
  fun generateMatrix(n: Int): Array<IntArray> {
    val matrix = Array(n) { IntArray(n) }
    val total = n * n
    val directions = Directions()

    var i = 0
    var j = 0
    var current = 1
    var direction = directions.next()

    while (current <= total) {
      matrix[i][j] = current++

      if (
        i + direction.first !in 0 until n ||
        j + direction.second !in 0 until n ||
        matrix[i + direction.first][j + direction.second] != 0
      ) {
        direction = directions.next()
      }

      i += direction.first
      j += direction.second
    }

    return matrix
  }

  inner class Directions {
    private val directions = arrayOf(Pair(0, 1), Pair(1, 0), Pair(0, -1), Pair(-1, 0))
    private var current = 0

    fun next() = directions[current].also {
      current = if (current == 3) 0 else current + 1
    }
  }
}