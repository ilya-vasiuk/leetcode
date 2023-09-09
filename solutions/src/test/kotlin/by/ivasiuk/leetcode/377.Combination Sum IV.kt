package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CombinationSum4Test {
  private val solution = CombinationSum4()

  @Test
  fun example1() {
    assertEquals(
      expected = 7,
      actual = solution.combinationSum4(
        nums = intArrayOf(1, 2, 3),
        target = 4
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.combinationSum4(
        nums = intArrayOf(9),
        target = 3
      )
    )
  }
}
