package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/valid-sudoku/">
 *   Valid Sudoku</a>
 */
class ValidSudoku {
  fun isValidSudoku(board: Array<CharArray>): Boolean {
    val rows = Array(9) { mutableListOf<Char>() }
    val columns = Array(9) { mutableListOf<Char>() }
    val boxes = Array(3) { Array(3) { mutableListOf<Char>() } }

    for (i in board.indices) {
      for (j in board[i].indices) {
        if (board[i][j] == '.') continue

        //Check row
        if (rows[i].contains(board[i][j])) {
          return false
        } else {
          rows[i].add(board[i][j])
        }

        //Check column
        if (columns[j].contains(board[i][j])) {
          return false
        } else {
          columns[j].add(board[i][j])
        }

        //Check box
        if (boxes[i/3][j/3].contains(board[i][j])) {
          return false
        } else {
          boxes[i/3][j/3].add(board[i][j])
        }
      }
    }

    return true
  }
}