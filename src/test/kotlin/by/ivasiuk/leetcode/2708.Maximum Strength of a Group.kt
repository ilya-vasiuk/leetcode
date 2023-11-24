package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumStrengthOfAGroupTest {
  private val solution = MaximumStrengthOfAGroup()

  @Test
  fun example1() {
    assertEquals(
      expected = 1350,
      actual = solution.maxStrength(
        nums = intArrayOf(3, -1, -5, 2, 5, -9)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 20,
      actual = solution.maxStrength(
        nums = intArrayOf(-4, -5, -4)
      )
    )
  }
}
