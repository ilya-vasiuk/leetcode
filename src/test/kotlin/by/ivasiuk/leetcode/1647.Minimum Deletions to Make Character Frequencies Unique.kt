package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumDeletionsToMakeCharacterFrequenciesUniqueTest {
  private val solution = MinimumDeletionsToMakeCharacterFrequenciesUnique()

  @Test
  fun example1() {
    assertEquals(
      expected = 0,
      actual = solution.minDeletions(
        s = "aab"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.minDeletions(
        s = "aaabbbcc"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 2,
      actual = solution.minDeletions(
        s = "ceabaacb"
      )
    )
  }
}
