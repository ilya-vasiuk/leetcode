package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class TransposeMatrixTest {
  private val solution = TransposeMatrix()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(1, 4, 7),
        intArrayOf(2, 5, 8),
        intArrayOf(3, 6, 9),
      ),
      actual = solution.transpose(
        matrix = arrayOf(
          intArrayOf(1, 2, 3),
          intArrayOf(4, 5, 6),
          intArrayOf(7, 8, 9),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(1, 4),
        intArrayOf(2, 5),
        intArrayOf(3, 6),
      ),
      actual = solution.transpose(
        matrix = arrayOf(
          intArrayOf(1, 2, 3),
          intArrayOf(4, 5, 6),
        )
      )
    )
  }
}
