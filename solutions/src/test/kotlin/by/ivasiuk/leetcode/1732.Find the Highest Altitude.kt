package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindTheHighestAltitudeTest {
  private val solution = FindTheHighestAltitude()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.largestAltitude(
        gain = intArrayOf(-5, 1, 5, 0, -7),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.largestAltitude(
        gain = intArrayOf(-4,-3,-2,-1,4,3,2),
      )
    )
  }
}
