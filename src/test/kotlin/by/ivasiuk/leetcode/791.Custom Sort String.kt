package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CustomSortStringTest {
  private val solution = CustomSortString()

  @Test
  fun example1() {
    assertEquals(
      expected = "cbad",
      actual = solution.customSortString(
        order = "cba",
        s = "abcd"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "bcad",
      actual = solution.customSortString(
        order = "bcafg",
        s = "abcd"
      )
    )
  }
}
