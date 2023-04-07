package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfEnclavesTest {
  private val solution = NumberOfEnclaves()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.numEnclaves(
        grid = arrayOf(
          intArrayOf(0, 0, 0, 0),
          intArrayOf(1, 0, 1, 0),
          intArrayOf(0, 1, 1, 0),
          intArrayOf(0, 0, 0, 0),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.numEnclaves(
        grid = arrayOf(
          intArrayOf(0, 1, 1, 0),
          intArrayOf(0, 0, 1, 0),
          intArrayOf(0, 0, 1, 0),
          intArrayOf(0, 0, 0, 0),
        )
      )
    )
  }
}