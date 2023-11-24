package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SortAnArrayTest {
  private val solution = SortAnArray()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(1, 2, 3, 5),
      actual = solution.sortArray(
        nums = intArrayOf(5, 2, 3, 1),
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(0, 0, 1, 1, 2, 5),
      actual = solution.sortArray(
        nums = intArrayOf(5, 1, 1, 2, 0, 0),
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = intArrayOf(-1, 3),
      actual = solution.sortArray(
        nums = intArrayOf(3, -1),
      )
    )
  }
}
