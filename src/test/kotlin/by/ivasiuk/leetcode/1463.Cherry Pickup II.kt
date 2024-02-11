package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CherryPickup2Test {
  private val solution = CherryPickup2()

  @Test
  fun example1() {
    assertEquals(
      expected = 24,
      actual = solution.cherryPickup(
        grid = arrayOf(
          intArrayOf(3, 1, 1),
          intArrayOf(2, 5, 1),
          intArrayOf(1, 5, 5),
          intArrayOf(2, 1, 1),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 28,
      actual = solution.cherryPickup(
        grid = arrayOf(
          intArrayOf(1, 0, 0, 0, 0, 0, 1),
          intArrayOf(2, 0, 0, 0, 0, 3, 0),
          intArrayOf(2, 0, 9, 0, 0, 0, 0),
          intArrayOf(0, 3, 0, 5, 4, 0, 0),
          intArrayOf(1, 0, 2, 3, 0, 0, 6),
        )
      )
    )
  }
}
