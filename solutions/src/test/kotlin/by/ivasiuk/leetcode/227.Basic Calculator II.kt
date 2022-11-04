package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class BasicCalculator2Test {
  private val solution = BasicCalculator2()

  @Test
  fun example1() {
    assertEquals(
      expected = 7,
      actual = solution.calculate("3+2*2")
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.calculate("3/2")
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 5,
      actual = solution.calculate(" 3+5 / 2 ")
    )
  }

  @Test
  fun example4() {
    assertEquals(
      expected = 0,
      actual = solution.calculate("12-3*4")
    )
  }
}