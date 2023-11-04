package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LastMomentBeforeAllAntsFallOutOfAPlankTest {
  private val solution = LastMomentBeforeAllAntsFallOutOfAPlank()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.getLastMoment(
        n = 4,
        left = intArrayOf(4, 3),
        right = intArrayOf(0, 1),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 7,
      actual = solution.getLastMoment(
        n = 7,
        left = intArrayOf(),
        right = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7),
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 7,
      actual = solution.getLastMoment(
        n = 7,
        left = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7),
        right = intArrayOf(),
      )
    )
  }
}
