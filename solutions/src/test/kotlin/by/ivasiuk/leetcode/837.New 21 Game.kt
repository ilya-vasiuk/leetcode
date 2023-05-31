package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class New21GameTest {
  private val solution = New21Game()

  @Test
  fun example1() {
    assertEquals(
      expected = 1.0,
      actual = solution.new21Game(
        n = 10,
        k = 1,
        maxPts = 10,
      ),
      absoluteTolerance = 1e-5,
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0.6,
      actual = solution.new21Game(
        n = 6,
        k = 1,
        maxPts = 10,
      ),
      absoluteTolerance = 1e-5,
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0.73278,
      actual = solution.new21Game(
        n = 21,
        k = 17,
        maxPts = 10,
      ),
      absoluteTolerance = 1e-5,
    )

  }
}
