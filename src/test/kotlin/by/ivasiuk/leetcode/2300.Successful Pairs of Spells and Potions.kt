package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SuccessfulPairsOfSpellsAndPotionsTest {
  private val solution = SuccessfulPairsOfSpellsAndPotions()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(4, 0, 3),
      actual = solution.successfulPairs(
        spells = intArrayOf(5, 1, 3),
        potions = intArrayOf(1, 2, 3, 4, 5),
        success = 7
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(2, 0, 2),
      actual = solution.successfulPairs(
        spells = intArrayOf(3, 1, 2),
        potions = intArrayOf(8, 5, 8),
        success = 16
      )
    )
  }
}
