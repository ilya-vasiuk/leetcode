package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/word-search/">
 *   Word Search</a>
 */
class WordSearch {
  fun exist(board: Array<CharArray>, word: String): Boolean {
    val m = board.size
    val n = board[0].size
    val visited = Array(m) { BooleanArray(n) }

    for (i in 0 until m) {
      for (j in 0 until n) {
        if (board[i][j] == word[0]) {
          if (check(board, m, n, i, j, word, 0, visited)) {
            return true
          }
        }
      }
    }

    return false
  }

  private fun check(
    board: Array<CharArray>,
    m: Int,
    n: Int,
    i: Int,
    j: Int,
    word: String,
    current: Int,
    visited: Array<BooleanArray>
  ): Boolean =
    if (
      i in 0 until m &&
      j in 0 until n &&
      current < word.length &&
      board[i][j] == word[current] &&
      !visited[i][j]
    ) {
      if (current == word.length - 1) {
        true
      } else {
        visited[i][j] = true

        val result = check(board, m, n, i - 1, j, word, current + 1, visited) ||
            check(board, m, n, i, j + 1, word, current + 1, visited) ||
            check(board, m, n, i + 1, j, word, current + 1, visited) ||
            check(board, m, n, i, j - 1, word, current + 1, visited)

        visited[i][j] = false

        result
      }
    } else {
      false
    }
}