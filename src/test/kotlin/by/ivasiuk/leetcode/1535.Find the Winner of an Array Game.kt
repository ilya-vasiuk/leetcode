package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindTheWinnerOfAnArrayGameTest {
  private val solution = FindTheWinnerOfAnArrayGame()

  @Test
  fun example1() {
    assertEquals(
      expected = 5,
      actual = solution.getWinner(
        arr = intArrayOf(2, 1, 3, 5, 4, 6, 7),
        k = 2
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.getWinner(
        arr = intArrayOf(3, 2, 1),
        k = 10
      )
    )
  }
}
