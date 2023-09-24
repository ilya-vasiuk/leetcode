package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ChampagneTowerTest {
  private val solution = ChampagneTower()

  @Test
  fun example1() {
    assertEquals(
      expected = 0.0,
      actual = solution.champagneTower(
        poured = 1,
        query_row = 1,
        query_glass = 1,
      ),
      absoluteTolerance = 1e-5,
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0.5,
      actual = solution.champagneTower(
        poured = 2,
        query_row = 1,
        query_glass = 1,
      ),
      absoluteTolerance = 1e-5,
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1.0,
      actual = solution.champagneTower(
        poured = 100000009,
        query_row = 33,
        query_glass = 17,
      ),
      absoluteTolerance = 1e-5,
    )
  }
}
