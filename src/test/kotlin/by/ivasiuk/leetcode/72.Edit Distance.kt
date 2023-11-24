package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class EditDistanceTest {
  private val solution = EditDistance()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.minDistance(
        word1 = "horse",
        word2 = "ros",
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 5,
      actual = solution.minDistance(
        word1 = "intention",
        word2 = "execution",
      )
    )
  }
}