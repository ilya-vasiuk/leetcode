package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MostStonesRemovedWithSameRowOrColumnTest {
  private val solution = MostStonesRemovedWithSameRowOrColumn()

  @Test
  fun example1() {
    assertEquals(
      expected = 5,
      actual = solution.removeStones(
        stones = arrayOf(
          intArrayOf(0, 0),
          intArrayOf(0, 1),
          intArrayOf(1, 0),
          intArrayOf(1, 2),
          intArrayOf(2, 1),
          intArrayOf(2, 2),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.removeStones(
        stones = arrayOf(
          intArrayOf(0, 0),
          intArrayOf(0, 2),
          intArrayOf(1, 1),
          intArrayOf(2, 0),
          intArrayOf(2, 2),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.removeStones(
        stones = arrayOf(
          intArrayOf(0, 0),
        )
      )
    )
  }
}