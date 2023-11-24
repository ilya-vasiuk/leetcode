package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class RestoreTheArrayFromAdjacentPairsTest {
  private val solution = RestoreTheArrayFromAdjacentPairs()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(1, 2, 3, 4),
      actual = solution.restoreArray(
        adjacentPairs = arrayOf(
          intArrayOf(2, 1),
          intArrayOf(3, 4),
          intArrayOf(3, 2),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(-2, 4, 1, -3),
      actual = solution.restoreArray(
        adjacentPairs = arrayOf(
          intArrayOf(4, -2),
          intArrayOf(1, 4),
          intArrayOf(-3, 1),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = intArrayOf(100000, -100000),
      actual = solution.restoreArray(
        adjacentPairs = arrayOf(
          intArrayOf(100000, -100000),
        )
      )
    )
  }
}
