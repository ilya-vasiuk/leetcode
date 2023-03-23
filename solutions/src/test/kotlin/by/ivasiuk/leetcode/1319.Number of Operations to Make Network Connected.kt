package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfOperationsToMakeNetworkConnectedTest {
  private val solution = NumberOfOperationsToMakeNetworkConnected()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.makeConnected(
        n = 4,
        connections = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(0, 2),
          intArrayOf(1, 2),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.makeConnected(
        n = 6,
        connections = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(0, 2),
          intArrayOf(0, 3),
          intArrayOf(1, 2),
          intArrayOf(1, 3),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = -1,
      actual = solution.makeConnected(
        n = 6,
        connections = arrayOf(
          intArrayOf(0, 1),
          intArrayOf(0, 2),
          intArrayOf(0, 3),
          intArrayOf(1, 2),
        )
      )
    )
  }

  @Test
  fun example4() {
    assertEquals(
      expected = 3,
      actual = solution.makeConnected(
        n = 11,
        connections = arrayOf(
          intArrayOf(1, 4),
          intArrayOf(0, 3),
          intArrayOf(1, 3),
          intArrayOf(3, 7),
          intArrayOf(2, 7),
          intArrayOf(0, 1),
          intArrayOf(2, 4),
          intArrayOf(3, 6),
          intArrayOf(5, 6),
          intArrayOf(6, 7),
          intArrayOf(4, 7),
          intArrayOf(0, 7),
          intArrayOf(5, 7),
        )
      )
    )
  }
}
