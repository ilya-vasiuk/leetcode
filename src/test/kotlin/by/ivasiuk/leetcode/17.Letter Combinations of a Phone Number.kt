package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class LetterCombinationsOfAPhoneNumberTest {
  private val solution = LetterCombinationsOfAPhoneNumber()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
      actual = solution.letterCombinations("23")
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = emptyList(),
      actual = solution.letterCombinations("")
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = listOf("a", "b", "c"),
      actual = solution.letterCombinations("2")
    )
  }
}