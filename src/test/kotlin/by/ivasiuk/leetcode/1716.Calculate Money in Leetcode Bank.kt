package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CalculateMoneyInLeetcodeBankTest {
  private val solution = CalculateMoneyInLeetcodeBank()

  @Test
  fun example1() {
    assertEquals(
      expected = 10,
      actual = solution.totalMoney(
        n = 4
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 37,
      actual = solution.totalMoney(
        n = 10
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 96,
      actual = solution.totalMoney(
        n = 20
      )
    )
  }
}
