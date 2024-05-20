package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SumOfAllSubsetXorTotalsTest {
  private val solution = SumOfAllSubsetXorTotals()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.subsetXORSum(
        nums = intArrayOf(1, 3)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 28,
      actual = solution.subsetXORSum(
        nums = intArrayOf(5, 1, 6)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 480,
      actual = solution.subsetXORSum(
        nums = intArrayOf(3, 4, 5, 6, 7, 8)
      )
    )
  }
}
