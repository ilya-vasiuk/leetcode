package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class RevealCardsInIncreasingOrderTest {
  private val solution = RevealCardsInIncreasingOrder()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(2, 13, 3, 11, 5, 17, 7),
      actual = solution.deckRevealedIncreasing(
        deck = intArrayOf(17, 13, 11, 2, 3, 5, 7)
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(1, 1000),
      actual = solution.deckRevealedIncreasing(
        deck = intArrayOf(1, 1000)
      )
    )
  }
}
