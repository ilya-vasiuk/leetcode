package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class FindPlayersWithOneOrZeroLosesTest {
  private val solution = FindPlayersWithOneOrZeroLoses()

  @Test
  fun example1() {
    val result = solution.findWinners(
      matches = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(2, 3),
        intArrayOf(3, 6),
        intArrayOf(5, 6),
        intArrayOf(5, 7),
        intArrayOf(4, 5),
        intArrayOf(4, 8),
        intArrayOf(4, 9),
        intArrayOf(10, 4),
        intArrayOf(10, 9),
      )
    )

    assertContentEquals(
      expected = listOf(1, 2, 10),
      actual = result[0]
    )
    assertContentEquals(
      expected = listOf(4, 5, 7, 8),
      actual = result[1]
    )
  }

  @Test
  fun example2() {
    val result = solution.findWinners(
      matches = arrayOf(
        intArrayOf(2, 3),
        intArrayOf(1, 3),
        intArrayOf(5, 4),
        intArrayOf(6, 4),
      )
    )

    assertContentEquals(
      expected = listOf(1, 2, 5, 6),
      actual = result[0]
    )
    assertContentEquals(
      expected = emptyList(),
      actual = result[1]
    )
  }
}
