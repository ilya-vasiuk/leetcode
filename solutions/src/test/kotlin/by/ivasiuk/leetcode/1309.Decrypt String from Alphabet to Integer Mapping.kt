package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class DecryptStringFromAlphabetToIntegerMappingTest {
  private val solution = DecryptStringFromAlphabetToIntegerMapping()

  @Test
  fun example1() {
    assertEquals(
      expected = "jkab",
      actual = solution.freqAlphabets(
        s = "10#11#12"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "acz",
      actual = solution.freqAlphabets(
        s = "1326#"
      )
    )
  }
}
