package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class GuessNumberHigherOrLowerTest {
  @Test
  fun example1() {
    val solution = GuessNumberHigherOrLower(6)

    assertEquals(
      expected = 6,
      actual = solution.guessNumber(10)
    )
  }

  @Test
  fun example2() {
    val solution = GuessNumberHigherOrLower(1)

    assertEquals(
      expected = 1,
      actual = solution.guessNumber(1)
    )
  }

  @Test
  fun example3() {
    val solution = GuessNumberHigherOrLower(1)

    assertEquals(
      expected = 1,
      actual = solution.guessNumber(2)
    )
  }
}
