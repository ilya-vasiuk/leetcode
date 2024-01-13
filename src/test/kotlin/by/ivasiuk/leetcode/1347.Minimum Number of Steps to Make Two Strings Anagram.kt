package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumNumberOfStepsToMakeTwoStringsAnagramTest {
  private val solution = MinimumNumberOfStepsToMakeTwoStringsAnagram()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.minSteps(
        s = "bab",
        t = "aba",
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 5,
      actual = solution.minSteps(
        s = "leetcode",
        t = "practice",
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.minSteps(
        s = "anagram",
        t = "mangaar",
      )
    )
  }
}
