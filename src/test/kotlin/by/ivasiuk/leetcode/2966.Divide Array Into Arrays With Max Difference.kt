package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class DivideArrayIntoArraysWithMaxDifferenceTest {
  private val solution = DivideArrayIntoArraysWithMaxDifference()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(1, 1, 3),
        intArrayOf(3, 4, 5),
        intArrayOf(7, 8, 9),
      ),
      actual = solution.divideArray(
        nums = intArrayOf(1, 3, 4, 8, 7, 9, 3, 5, 1),
        k = 2
      )
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = emptyArray(),
      actual = solution.divideArray(
        nums = intArrayOf(1, 3, 3, 2, 7, 3),
        k = 3
      )
    )
  }

  @Test
  fun failed() {
    assertInnerCollectionsContentEquals(
      expected = emptyArray(),
      actual = solution.divideArray(
        nums = intArrayOf(15, 13, 12, 13, 12, 14, 12, 2, 3, 13, 12, 14, 14, 13, 5, 12, 12, 2, 13, 2, 2),
        k = 2
      )
    )
  }
}
