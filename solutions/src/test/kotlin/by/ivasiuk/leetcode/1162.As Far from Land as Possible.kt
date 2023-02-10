package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class AsFarFromLandAsPossibleTest {
  private val solution = AsFarFromLandAsPossible()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.maxDistance(
        grid = arrayOf(
          intArrayOf(1, 0, 1),
          intArrayOf(0, 0, 0),
          intArrayOf(1, 0, 1),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.maxDistance(
        grid = arrayOf(
          intArrayOf(1, 0, 0),
          intArrayOf(0, 0, 0),
          intArrayOf(0, 0, 0),
        )
      )
    )
  }
}
