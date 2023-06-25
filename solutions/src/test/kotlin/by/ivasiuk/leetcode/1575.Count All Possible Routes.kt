package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CountAllPossibleRoutesTest {
  private val solution = CountAllPossibleRoutes()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.countRoutes(
        locations = intArrayOf(2,3,6,8,4),
        start = 1,
        finish = 3,
        fuel = 5,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 5,
      actual = solution.countRoutes(
        locations = intArrayOf(4,3,1),
        start = 1,
        finish = 0,
        fuel = 6,
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.countRoutes(
        locations = intArrayOf(5,2,1),
        start = 0,
        finish = 2,
        fuel = 3,
      )
    )
  }
}
