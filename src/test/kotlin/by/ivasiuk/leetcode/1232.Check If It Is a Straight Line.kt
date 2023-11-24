package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CheckIfItIsAStraightLineTest {
  private val solution = CheckIfItIsAStraightLine()

  @Test
  fun example1() {
    assertTrue {
      solution.checkStraightLine(
        coordinates = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(2, 3),
          intArrayOf(3, 4),
          intArrayOf(4, 5),
          intArrayOf(5, 6),
          intArrayOf(6, 7),
        )
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.checkStraightLine(
        coordinates = arrayOf(
          intArrayOf(1, 1),
          intArrayOf(2, 2),
          intArrayOf(3, 4),
          intArrayOf(4, 5),
          intArrayOf(5, 6),
          intArrayOf(7, 7),
        )
      )
    }
  }
}
