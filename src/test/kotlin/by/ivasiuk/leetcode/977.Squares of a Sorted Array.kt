package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SquaresOfASortedArrayTest {
  private val solution = SquaresOfASortedArray()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(0, 1, 9, 16, 100),
      actual = solution.sortedSquares(
        nums = intArrayOf(-4, -1, 0, 3, 10)
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(4, 9, 9, 49, 121),
      actual = solution.sortedSquares(
        nums = intArrayOf(-7, -3, 2, 3, 11)
      )
    )
  }
}
