package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfWaysToFormATargetStringGivenADictionaryTest {
  private val solution = NumberOfWaysToFormATargetStringGivenADictionary()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.numWays(
        words = arrayOf("acca", "bbbb", "caca"),
        target = "aba"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 4,
      actual = solution.numWays(
        words = arrayOf("abba","baab"),
        target = "bab"
      )
    )
  }
}
