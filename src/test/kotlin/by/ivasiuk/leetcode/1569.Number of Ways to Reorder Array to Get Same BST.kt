package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfWaysToReorderArrayToGetSameBSTTest {
  private val solution = NumberOfWaysToReorderArrayToGetSameBST()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.numOfWays(
        nums = intArrayOf(2, 1, 3)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 5,
      actual = solution.numOfWays(
        nums = intArrayOf(3, 4, 5, 1, 2)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.numOfWays(
        nums = intArrayOf(1, 2, 3)
      )
    )
  }
}
