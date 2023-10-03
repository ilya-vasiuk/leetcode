package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfGoodPairsTest {
  private val solution = NumberOfGoodPairs()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.numIdenticalPairs(
        nums = intArrayOf(1, 2, 3, 1, 1, 3),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 6,
      actual = solution.numIdenticalPairs(
        nums = intArrayOf(1, 1, 1, 1),
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.numIdenticalPairs(
        nums = intArrayOf(1, 2, 3),
      )
    )
  }
}
