package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class ReshapeTheMatrixTest {
  private val solution = ReshapeTheMatrix()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(1, 2, 3, 4)
      ),
      actual = solution.matrixReshape(
        mat = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(3, 4),
        ),
        r = 1,
        c = 4,
      )
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4),
      ),
      actual = solution.matrixReshape(
        mat = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(3, 4),
        ),
        r = 2,
        c = 4,
      )
    )
  }
}