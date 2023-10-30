package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class PoorPigsTest {
  private val solution = PoorPigs()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.poorPigs(
        buckets = 4,
        minutesToDie = 15,
        minutesToTest = 15,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.poorPigs(
        buckets = 4,
        minutesToDie = 15,
        minutesToTest = 30,
      )
    )
  }
}
