package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumNumberOfVowelsInASubstringOfGivenLengthTest {
  private val solution = MaximumNumberOfVowelsInASubstringOfGivenLength()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.maxVowels(
        s = "abciiidef",
        k = 3
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.maxVowels(
        s = "aeiou",
        k = 2
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 2,
      actual = solution.maxVowels(
        s = "leetcode",
        k = 3
      )
    )
  }

  @Test
  fun example4() {
    assertEquals(
      expected = 7,
      actual = solution.maxVowels(
        s = "ibpbhixfiouhdljnjfflpapptrxgcomvnb",
        k = 33
      )
    )
  }
}
