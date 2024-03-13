package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindThePivotIntegerTest {
  private val solution = FindThePivotInteger()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.pivotInteger(
        n = 8
      ),
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.pivotInteger(
        n = 1
      ),
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = -1,
      actual = solution.pivotInteger(
        n = 4
      ),
    )
  }
}
