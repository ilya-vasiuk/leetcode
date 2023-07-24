package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class PowTest {
  private val solution = Pow()

  @Test
  fun example1() {
    assertEquals(
      expected = 1024.00000,
      actual = solution.myPow(
        x = 2.00000,
        n = 10
      ),
      absoluteTolerance = 1e-5
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 9.26100,
      actual = solution.myPow(
        x = 2.10000,
        n = 3
      ),
      absoluteTolerance = 1e-5
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0.25000,
      actual = solution.myPow(
        x = 2.00000,
        n = -2
      ),
      absoluteTolerance = 1e-5
    )
  }
}
