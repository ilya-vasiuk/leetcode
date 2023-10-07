package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class BuildArrayWhereYouCanFindTheMaximumExactlyKComparisonsTest {
  private val solution = BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.numOfArrays(
        n = 2,
        m = 3,
        k = 1,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.numOfArrays(
        n = 5,
        m = 2,
        k = 3,
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1,
      actual = solution.numOfArrays(
        n = 9,
        m = 1,
        k = 1,
      )
    )
  }
}
