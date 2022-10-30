package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfProvincesTest {
  private val solution = NumberOfProvinces()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.findCircleNum(
        isConnected = arrayOf(
          intArrayOf(1, 1, 0),
          intArrayOf(1, 1, 0),
          intArrayOf(0, 0, 1),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.findCircleNum(
        isConnected = arrayOf(
          intArrayOf(1, 0, 0),
          intArrayOf(0, 1, 0),
          intArrayOf(0, 0, 1),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1,
      actual = solution.findCircleNum(
        isConnected = arrayOf(
          intArrayOf(1, 0, 0, 1),
          intArrayOf(0, 1, 1, 0),
          intArrayOf(0, 1, 1, 1),
          intArrayOf(1, 0, 1, 1),
        )
      )
    )
  }
}