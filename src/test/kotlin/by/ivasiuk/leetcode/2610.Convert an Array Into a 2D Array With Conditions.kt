package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class ConvertAnArrayIntoA2DArrayWithConditionsTest {
  private val solution = ConvertAnArrayIntoA2DArrayWithConditions()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = listOf(listOf(1, 3, 4, 2), listOf(1, 3), listOf(1)),
      actual = solution.findMatrix(
        nums = intArrayOf(1, 3, 4, 1, 2, 3, 1)
      )
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = listOf(listOf(1, 2, 3, 4)),
      actual = solution.findMatrix(
        nums = intArrayOf(1, 2, 3, 4)
      )
    )
  }
}
