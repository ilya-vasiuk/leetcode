package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumNumberOfTapsToOpenToWaterAGardenTest {
  private val solution = MinimumNumberOfTapsToOpenToWaterAGarden()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.minTaps(
        n = 5,
        ranges = intArrayOf(3, 4, 1, 1, 0, 0)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = -1,
      actual = solution.minTaps(
        n = 3,
        ranges = intArrayOf(0, 0, 0, 0)
      )
    )
  }
}
