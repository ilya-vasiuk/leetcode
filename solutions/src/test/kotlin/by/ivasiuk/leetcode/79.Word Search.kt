package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class WordSearchTest {
  private val solution = WordSearch()

  @Test
  fun example1() {
    assertTrue {
      solution.exist(
        board = arrayOf(
          charArrayOf('A', 'B', 'C', 'E'),
          charArrayOf('S', 'F', 'C', 'S'),
          charArrayOf('A', 'D', 'E', 'E'),
        ),
        word = "ABCCED"
      )
    }
  }

  @Test
  fun example2() {
    assertTrue {
      solution.exist(
        board = arrayOf(
          charArrayOf('A', 'B', 'C', 'E'),
          charArrayOf('S', 'F', 'C', 'S'),
          charArrayOf('A', 'D', 'E', 'E'),
        ),
        word = "SEE"
      )
    }
  }

  @Test
  fun example3() {
    assertFalse {
      solution.exist(
        board = arrayOf(
          charArrayOf('A', 'B', 'C', 'E'),
          charArrayOf('S', 'F', 'C', 'S'),
          charArrayOf('A', 'D', 'E', 'E'),
        ),
        word = "ABCB"
      )
    }
  }
}