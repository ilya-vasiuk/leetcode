package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class BasicCalculatorTest {
  private val solution = BasicCalculator()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.calculate("1 + 1")
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.calculate(" 2-1 + 2 ")
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 23,
      actual = solution.calculate("(1+(4+5+2)-3)+(6+8)")
    )
  }

  @Test
  fun example4() {
    assertEquals(
      expected = -8,
      actual = solution.calculate("-8")
    )
  }

  @Test
  fun example5() {
    assertEquals(
      expected = -12,
      actual = solution.calculate("- (3 - (- (4 + 5) ) )")
    )
  }

}