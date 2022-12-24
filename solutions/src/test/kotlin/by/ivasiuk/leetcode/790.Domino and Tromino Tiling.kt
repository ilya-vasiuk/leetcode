package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class DominoAndTrominoTilingTest {
  private val solution = DominoAndTrominoTiling()

  @Test
  fun example1() {
    assertEquals(
      expected = 5,
      actual = solution.numTilings(
        n = 3
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 5,
      actual = solution.numTilings(
        n = 3
      )
    )
  }
}
