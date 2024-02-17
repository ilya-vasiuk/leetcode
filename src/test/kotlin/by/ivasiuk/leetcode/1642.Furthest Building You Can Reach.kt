package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FurthestBuildingYouCanReachTest {
  private val solution = FurthestBuildingYouCanReach()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.furthestBuilding(
        heights = intArrayOf(4, 2, 7, 6, 9, 14, 12),
        bricks = 5,
        ladders = 1,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 7,
      actual = solution.furthestBuilding(
        heights = intArrayOf(4, 12, 2, 7, 3, 18, 20, 3, 19),
        bricks = 10,
        ladders = 2,
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 3,
      actual = solution.furthestBuilding(
        heights = intArrayOf(14, 3, 19, 3),
        bricks = 17,
        ladders = 0,
      )
    )
  }

  @Test
  fun failed() {
    assertEquals(
      expected = 7,
      actual = solution.furthestBuilding(
        heights = intArrayOf(1, 13, 1, 1, 13, 5, 11, 11),
        bricks = 10,
        ladders = 8,
      )
    )
  }
}
