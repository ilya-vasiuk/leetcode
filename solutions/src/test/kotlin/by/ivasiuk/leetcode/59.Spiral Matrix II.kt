package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class SpiralMatrix2Test {
  private val solution = SpiralMatrix2()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(8, 9, 4),
        intArrayOf(7, 6, 5),
      ),
      actual = solution.generateMatrix(3)
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(1),
      ),
      actual = solution.generateMatrix(1)
    )
  }
}
