package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class BusRoutesTest {
  private val solution = BusRoutes()

  @Test
  fun example1() {
    val result = solution.numBusesToDestination(
      routes = arrayOf(
        intArrayOf(1, 2, 7),
        intArrayOf(3, 6, 7),
      ),
      source = 1,
      target = 6
    )

    assertEquals(2, result)
  }

  @Test
  fun example2() {
    val result = solution.numBusesToDestination(
      routes = arrayOf(
        intArrayOf(7, 12),
        intArrayOf(4, 5, 15),
        intArrayOf(6),
        intArrayOf(15, 19),
        intArrayOf(9, 12, 13),
      ),
      source = 15,
      target = 12
    )

    assertEquals(-1, result)
  }
}