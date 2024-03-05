package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumLengthOfStringAfterDeletingSimilarEndsTest {
  private val solution = MinimumLengthOfStringAfterDeletingSimilarEnds()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.minimumLength(
        s = "ca"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.minimumLength(
        s = "cabaabac"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 3,
      actual = solution.minimumLength(
        s = "aabccabba"
      )
    )
  }
}
