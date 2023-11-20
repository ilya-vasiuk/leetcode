package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumAmountOfTimeToCollectGarbageTest {
  private val solution = MinimumAmountOfTimeToCollectGarbage()

  @Test
  fun example1() {
    assertEquals(
      expected = 21,
      actual = solution.garbageCollection(
        garbage = arrayOf("G", "P", "GP", "GG"),
        travel = intArrayOf(2, 4, 3),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 37,
      actual = solution.garbageCollection(
        garbage = arrayOf("MMM", "PGM", "GP"),
        travel = intArrayOf(3, 10),
      )
    )
  }
}
