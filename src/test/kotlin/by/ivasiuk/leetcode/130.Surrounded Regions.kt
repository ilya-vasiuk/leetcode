package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

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

    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        charArrayOf('X', 'X', 'X', 'X'),
        charArrayOf('X', 'X', 'X', 'X'),
        charArrayOf('X', 'X', 'X', 'X'),
        charArrayOf('X', 'O', 'X', 'X'),
      ),
      actual = board
    )
  }

  @Test
  fun example2() {
    val board = arrayOf(
      charArrayOf('X'),
    )

    solution.solve(board)

    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        charArrayOf('X'),
      ),
      actual = board
    )
  }
}