package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SurroundedRegionsTest {
  private val solution = SurroundedRegions()

  @Test
  fun example1() {
    val board = arrayOf(
      charArrayOf('X', 'X', 'X', 'X'),
      charArrayOf('X', 'O', 'O', 'X'),
      charArrayOf('X', 'X', 'O', 'X'),
      charArrayOf('X', 'O', 'X', 'X'),
    )

    solution.solve(board)

    val expected = arrayOf(
      charArrayOf('X', 'X', 'X', 'X'),
      charArrayOf('X', 'X', 'X', 'X'),
      charArrayOf('X', 'X', 'X', 'X'),
      charArrayOf('X', 'O', 'X', 'X'),
    )

    for (i in board.indices) {
      assertContentEquals(expected[i], board[i])
    }
  }

  @Test
  fun example2() {
    val board = arrayOf(charArrayOf('X'))

    solution.solve(board)

    val expected = arrayOf(charArrayOf('X'))

    for (i in board.indices) {
      assertContentEquals(expected[i], board[i])
    }
  }
}