package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidSudokuTest {
  private val solution = ValidSudoku()

  @Test
  fun example1() {
    val board = arrayOf(
      charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
      charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
      charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
      charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
      charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
      charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
      charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
      charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
      charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9'),
    )

    assertTrue {
      solution.isValidSudoku(board)
    }
  }

  @Test
  fun example2() {
    val board = arrayOf(
      charArrayOf('8', '3', '.', '.', '7', '.', '.', '.', '.'),
      charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
      charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
      charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
      charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
      charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
      charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
      charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
      charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9'),
    )

    assertFalse {
      solution.isValidSudoku(board)
    }
  }
}