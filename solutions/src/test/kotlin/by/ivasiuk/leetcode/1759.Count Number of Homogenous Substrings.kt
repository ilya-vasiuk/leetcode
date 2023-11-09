package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CountNumberOfHomogenousSubstringsTest {
  private val solution = CountNumberOfHomogenousSubstrings()

  @Test
  fun example1() {
    assertEquals(
      expected = 13,
      actual = solution.countHomogenous(
        s = "abbcccaa"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.countHomogenous(
        s = "xy"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 15,
      actual = solution.countHomogenous(
        s = "zzzzz"
      )
    )
  }
}
