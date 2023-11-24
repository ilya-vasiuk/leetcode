package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SortArrayByParityTest {
  private val solution = SortArrayByParity()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(4, 2, 1, 3),
      actual = solution.sortArrayByParity(
        nums = intArrayOf(3, 1, 2, 4)
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(0),
      actual = solution.sortArrayByParity(
        nums = intArrayOf(0)
      )
    )
  }
}
