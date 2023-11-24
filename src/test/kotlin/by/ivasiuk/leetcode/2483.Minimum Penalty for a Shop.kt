package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumPenaltyForAShopTest {
  private val solution = MinimumPenaltyForAShop()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.bestClosingTime(
        customers = "YYNY"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.bestClosingTime(
        customers = "NNNNN"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 4,
      actual = solution.bestClosingTime(
        customers = "YYYY"
      )
    )
  }
}
