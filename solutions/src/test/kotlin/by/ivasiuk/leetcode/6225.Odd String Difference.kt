package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class OddStringDifferenceTest {
  private val solution = OddStringDifference()

  @Test
  fun example1() {
    assertEquals("abc", solution.oddString(arrayOf("adc","wzy","abc")))
  }

  @Test
  fun example2() {
    assertEquals("bob", solution.oddString(arrayOf("aaa","bob","ccc","ddd")))
  }
}