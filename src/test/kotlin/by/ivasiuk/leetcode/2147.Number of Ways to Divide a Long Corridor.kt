package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfWaysToDivideALongCorridorTest {
  private val solution = NumberOfWaysToDivideALongCorridor()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.numberOfWays(
        corridor = "SSPPSPS"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.numberOfWays(
        corridor = "PPSPSP"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.numberOfWays(
        corridor = "S"
      )
    )
  }
}
