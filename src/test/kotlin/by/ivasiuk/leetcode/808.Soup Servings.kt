package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SoupServingsTest {
  private val solution = SoupServings()

  @Test
  fun example1() {
    assertEquals(
      expected = 0.62500,
      actual = solution.soupServings(
        n = 50
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0.71875,
      actual = solution.soupServings(
        n = 100
      )
    )
  }
}
