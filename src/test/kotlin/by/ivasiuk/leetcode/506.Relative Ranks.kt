package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class RelativeRanksTest {
  private val solution = RelativeRanks()

  @Test
  fun example1() {
    assertContentEquals(
      expected = arrayOf("Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"),
      actual = solution.findRelativeRanks(
        score = intArrayOf(5, 4, 3, 2, 1),
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = arrayOf("Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"),
      actual = solution.findRelativeRanks(
        score = intArrayOf(10, 3, 8, 9, 4),
      )
    )
  }
}
