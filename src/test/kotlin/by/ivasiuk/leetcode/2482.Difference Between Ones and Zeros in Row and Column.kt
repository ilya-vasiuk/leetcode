package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class DifferenceBetweenOnesAndZerosInRowAndColumnTest {
  private val solution = DifferenceBetweenOnesAndZerosInRowAndColumn()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(0, 0, 4),
        intArrayOf(0, 0, 4),
        intArrayOf(-2, -2, 2),
      ),
      actual = solution.onesMinusZeros(
        grid = arrayOf(
          intArrayOf(0, 1, 1),
          intArrayOf(1, 0, 1),
          intArrayOf(0, 0, 1),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(5, 5, 5),
        intArrayOf(5, 5, 5),
      ),
      actual = solution.onesMinusZeros(
        grid = arrayOf(
          intArrayOf(1, 1, 1),
          intArrayOf(1, 1, 1),
        )
      )
    )
  }
}
