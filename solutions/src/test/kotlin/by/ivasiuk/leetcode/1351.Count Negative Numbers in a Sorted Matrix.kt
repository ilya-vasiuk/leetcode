package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CountNegativeNumbersInASortedMatrixTest {
  private val solution = CountNegativeNumbersInASortedMatrix()

  @Test
  fun example1() {
    assertEquals(
      expected = 8,
      actual = solution.countNegatives(
        grid = arrayOf(
          intArrayOf(4,3,2,-1),
          intArrayOf(3,2,1,-1),
          intArrayOf(1,1,-1,-2),
          intArrayOf(-1,-1,-2,-3),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.countNegatives(
        grid = arrayOf(
          intArrayOf(3, 2),
          intArrayOf(1, 0),
        )
      )
    )
  }
}
