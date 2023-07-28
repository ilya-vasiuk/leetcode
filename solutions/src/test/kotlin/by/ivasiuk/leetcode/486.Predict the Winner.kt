package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PredictTheWinnerTest {
  private val solution = PredictTheWinner()

  @Test
  fun example1() {
    assertFalse {
      solution.PredictTheWinner(
        nums = intArrayOf(1, 5, 2),
      )
    }
  }

  @Test
  fun example2() {
    assertTrue {
      solution.PredictTheWinner(
        nums = intArrayOf(1, 5, 233, 7),
      )
    }
  }
}
