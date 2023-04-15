package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumValueOfKCoinsFromPilesTest {
  private val solution = MaximumValueOfKCoinsFromPiles()

  @Test
  fun example1() {
    assertEquals(
      expected = 101,
      actual = solution.maxValueOfCoins(
        piles = listOf(
          listOf(1, 100, 3),
          listOf(7, 8, 9)
        ),
        k = 2
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 706,
      actual = solution.maxValueOfCoins(
        piles = listOf(
          listOf(100),
          listOf(100),
          listOf(100),
          listOf(100),
          listOf(100),
          listOf(100),
          listOf(1, 1, 1, 1, 1, 1, 700)
        ),
        k = 7
      )
    )
  }
}
