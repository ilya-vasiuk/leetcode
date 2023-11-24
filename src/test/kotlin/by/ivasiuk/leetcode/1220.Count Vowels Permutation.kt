package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CountVowelsPermutationTest {
  private val solution = CountVowelsPermutation()

  @Test
  fun example1() {
    assertEquals(
      expected = 5,
      actual = solution.countVowelPermutation(1)
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 10,
      actual = solution.countVowelPermutation(2)
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 68,
      actual = solution.countVowelPermutation(5)
    )
  }
}
