package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CandyTest {
  private val solution = Candy()

  @Test
  fun example1() {
    assertEquals(
      expected = 5,
      actual = solution.candy(
        ratings = intArrayOf(1, 0, 2),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.candy(
        ratings = intArrayOf(1, 2, 2),
      )
    )
  }
}
