package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class KokoEatingBananasTest {
  private val solution = KokoEatingBananas()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.minEatingSpeed(
        piles = intArrayOf(3, 6, 7, 11),
        h = 8,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 30,
      actual = solution.minEatingSpeed(
        piles = intArrayOf(30, 11, 23, 4, 20),
        h = 5,
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 23,
      actual = solution.minEatingSpeed(
        piles = intArrayOf(30, 11, 23, 4, 20),
        h = 6,
      )
    )
  }
}
