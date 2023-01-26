package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CheapestFlightsWithinKStopsTest {
  private val solution = CheapestFlightsWithinKStops()

  @Test
  fun example1() {
    assertEquals(
      expected = 700,
      actual = solution.findCheapestPrice(
        n = 4,
        flights = arrayOf(
          intArrayOf(0, 1, 100),
          intArrayOf(1, 2, 100),
          intArrayOf(2, 0, 100),
          intArrayOf(1, 3, 600),
          intArrayOf(2, 3, 200),
        ),
        src = 0,
        dst = 3,
        k = 1
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 200,
      actual = solution.findCheapestPrice(
        n = 3,
        flights = arrayOf(
          intArrayOf(0, 1, 100),
          intArrayOf(1, 2, 100),
          intArrayOf(0, 2, 500),
        ),
        src = 0,
        dst = 2,
        k = 1
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 500,
      actual = solution.findCheapestPrice(
        n = 3,
        flights = arrayOf(
          intArrayOf(0, 1, 100),
          intArrayOf(1, 2, 100),
          intArrayOf(0, 2, 500),
        ),
        src = 0,
        dst = 2,
        k = 0
      )
    )
  }
}
