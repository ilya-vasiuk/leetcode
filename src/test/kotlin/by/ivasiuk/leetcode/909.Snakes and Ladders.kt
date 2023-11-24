package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SnakesAndLaddersTest {
  private val solution = SnakesAndLadders()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.snakesAndLadders(
        board = arrayOf(
          intArrayOf(-1, -1, -1, -1, -1, -1),
          intArrayOf(-1, -1, -1, -1, -1, -1),
          intArrayOf(-1, -1, -1, -1, -1, -1),
          intArrayOf(-1, 35, -1, -1, 13, -1),
          intArrayOf(-1, -1, -1, -1, -1, -1),
          intArrayOf(-1, 15, -1, -1, -1, -1),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.snakesAndLadders(
        board = arrayOf(
          intArrayOf(-1, -1),
          intArrayOf(-1, 3),
        )
      )
    )
  }
}
