package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/surrounded-regions/">
 *   Surrounded Regions</a>
 */
class SurroundedRegions {
  fun solve(board: Array<CharArray>) {
    val m = board.size
    val n = board[0].size

    for (i in 0 until m) {
      process(board, i, 0, m, n)
      process(board, i, n - 1, m, n)
    }

    for (j in 0 until n) {
      process(board, 0, j, m, n)
      process(board, m - 1, j, m, n)
    }

    for (i in 0 until m) {
      for (j in 0 until n) {
        board [i][j] = if (board[i][j] != 'P') 'X' else 'O'
      }
    }
  }

  private fun process(
    board: Array<CharArray>,
    i: Int,
    j: Int,
    m: Int,
    n: Int,
  ) {
    if (i in 0 until m && j in 0 until n && board[i][j] == 'O') {
      board[i][j] = 'P'
      process(board, i - 1, j, m, n)
      process(board, i, j + 1, m, n)
      process(board, i + 1, j, m, n)
      process(board, i, j - 1, m, n)
    }
  }
}