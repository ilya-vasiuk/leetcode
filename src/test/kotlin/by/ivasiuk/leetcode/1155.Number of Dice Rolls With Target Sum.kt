package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfDiceRollsWithTargetSumTest {
  private val solution = NumberOfDiceRollsWithTargetSum()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.numRollsToTarget(
        n = 1,
        k = 6,
        target = 3
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 6,
      actual = solution.numRollsToTarget(
        n = 2,
        k = 6,
        target = 7
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 222616187,
      actual = solution.numRollsToTarget(
        n = 30,
        k = 30,
        target = 500
      )
    )
  }
}
