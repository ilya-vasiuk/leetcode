package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class AddToArrayFormOfIntegerTest {
  private val solution = AddToArrayFormOfInteger()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(1, 2, 3, 4),
      actual = solution.addToArrayForm(
        num = intArrayOf(1, 2, 0, 0),
        k = 34
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(4, 5, 5),
      actual = solution.addToArrayForm(
        num = intArrayOf(2, 7, 4),
        k = 181
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = listOf(1, 0, 2, 1),
      actual = solution.addToArrayForm(
        num = intArrayOf(2, 1, 5),
        k = 806
      )
    )
  }
}
