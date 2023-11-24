package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RemoveColoredPiecesIfBothNeighborsAreTheSameColorTest {
  private val solution = RemoveColoredPiecesIfBothNeighborsAreTheSameColor()

  @Test
  fun example1() {
    assertTrue {
      solution.winnerOfGame(
        colors = "AAABABB"
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.winnerOfGame(
        colors = "AA"
      )
    }
  }

  @Test
  fun example3() {
    assertFalse {
      solution.winnerOfGame(
        colors = "ABBBBBBBAAA"
      )
    }
  }
}
