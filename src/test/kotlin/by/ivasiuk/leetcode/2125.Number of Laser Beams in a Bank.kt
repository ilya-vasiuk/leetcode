package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfLaserBeamsInABankTest {
  private val solution = NumberOfLaserBeamsInABank()

  @Test
  fun example1() {
    assertEquals(
      expected = 8,
      actual = solution.numberOfBeams(
        bank = arrayOf(
          "011001",
          "000000",
          "010100",
          "001000",
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.numberOfBeams(
        bank = arrayOf(
          "000",
          "111",
          "000",
        )
      )
    )
  }
}
