package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class TheNumberOfBeautifulSubsetsTest {
  private val solution = TheNumberOfBeautifulSubsets()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.beautifulSubsets(
        nums = intArrayOf(2, 4, 6),
        k = 2,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.beautifulSubsets(
        nums = intArrayOf(1),
        k = 1,
      )
    )
  }
}
