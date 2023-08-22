package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ExcelSheetColumnTitleTest {
  private val solution = ExcelSheetColumnTitle()

  @Test
  fun example1() {
    assertEquals(
      expected = "A",
      actual = solution.convertToTitle(
        columnNumber = 1
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "AB",
      actual = solution.convertToTitle(
        columnNumber = 28
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "ZY",
      actual = solution.convertToTitle(
        columnNumber = 701
      )
    )
  }
}
