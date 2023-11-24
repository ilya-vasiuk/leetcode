package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MultiplyStringsTest {
  private val solution = MultiplyStrings()

  @Test
  fun example1() {
    val result = solution.multiply("2", "3")
    assertEquals("6", result)
  }

  @Test
  fun example2() {
    val result = solution.multiply("123", "456")
    assertEquals("56088", result)
  }
}