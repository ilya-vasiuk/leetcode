package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LastStoneWeightTest {
  private val solution = LastStoneWeight()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.lastStoneWeight(
        stones = intArrayOf(2, 7, 4, 1, 8, 1)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.lastStoneWeight(
        stones = intArrayOf(1)
      )
    )
  }
}
