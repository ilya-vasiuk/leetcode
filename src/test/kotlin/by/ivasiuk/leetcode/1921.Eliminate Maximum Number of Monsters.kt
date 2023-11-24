package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class EliminateMaximumNumberOfMonstersTest {
  private val solution = EliminateMaximumNumberOfMonsters()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.eliminateMaximum(
        dist = intArrayOf(1, 3, 4),
        speed = intArrayOf(1, 1, 1)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.eliminateMaximum(
        dist = intArrayOf(1, 1, 2, 3),
        speed = intArrayOf(1, 1, 1, 1)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1,
      actual = solution.eliminateMaximum(
        dist = intArrayOf(3, 2, 4),
        speed = intArrayOf(5, 3, 2)
      )
    )
  }
}
