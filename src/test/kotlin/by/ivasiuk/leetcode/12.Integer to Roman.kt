package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class IntegerToRomanTest {
  private val solution = IntegerToRoman()

  @Test
  fun example1() {
    assertEquals("III", solution.intToRoman(3))
  }

  @Test
  fun example2() {
    assertEquals("LVIII", solution.intToRoman(58))
  }

  @Test
  fun example3() {
    assertEquals("MCMXCIV", solution.intToRoman(1994))
  }
}