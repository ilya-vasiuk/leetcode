package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ReorderRoutesToMakeAllPathsLeadToTheCityZeroTest {
  private val solution = ReorderRoutesToMakeAllPathsLeadToTheCityZero()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.minReorder(
        n = 6,
        connections = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(1, 3),
          intArrayOf(2, 3),
          intArrayOf(4, 0),
          intArrayOf(4, 5),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.minReorder(
        n = 5,
        connections = arrayOf(
          intArrayOf(1, 0),
          intArrayOf(1, 2),
          intArrayOf(3, 2),
          intArrayOf(3, 4),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.minReorder(
        n = 3,
        connections = arrayOf(
          intArrayOf(1, 0),
          intArrayOf(2, 0),
        )
      )
    )
  }
}
