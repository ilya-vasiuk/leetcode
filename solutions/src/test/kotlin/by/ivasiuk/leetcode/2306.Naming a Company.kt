package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NamingACompanyTest {
  private val solution = NamingACompany()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.distinctNames(
        ideas = arrayOf(
          "coffee",
          "donuts",
          "time",
          "toffee",
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.distinctNames(
        ideas = arrayOf(
          "lack",
          "back",
        )
      )
    )
  }
}
