package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class MoveZeroesTest {
  private val solution = MoveZeroes()

  @Test
  fun example1() {
    val input = intArrayOf(0, 1, 0, 3, 12)
    solution.moveZeroes(input)

    assertContentEquals(
      expected = intArrayOf(1, 3, 12, 0, 0),
      actual = input
    )
  }

  @Test
  fun example2() {
    val input = intArrayOf(0)
    solution.moveZeroes(input)

    assertContentEquals(
      expected = intArrayOf(0),
      actual = input
    )
  }
}