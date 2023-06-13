package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class EqualRowAndColumnPairsTest {
  private val solution = EqualRowAndColumnPairs()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.equalPairs(
        grid = arrayOf(
          intArrayOf(3, 2, 1),
          intArrayOf(1, 7, 6),
          intArrayOf(2, 7, 7),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.equalPairs(
        grid = arrayOf(
          intArrayOf(3, 1, 2, 2),
          intArrayOf(1, 4, 4, 5),
          intArrayOf(2, 4, 2, 2),
          intArrayOf(2, 4, 2, 2),
        )
      )
    )
  }
}
