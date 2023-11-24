package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class TheKWeakestRowsInAMatrixTest {
  private val solution = TheKWeakestRowsInAMatrix()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(2, 0, 3),
      actual = solution.kWeakestRows(
        mat = arrayOf(
          intArrayOf(1, 1, 0, 0, 0),
          intArrayOf(1, 1, 1, 1, 0),
          intArrayOf(1, 0, 0, 0, 0),
          intArrayOf(1, 1, 0, 0, 0),
          intArrayOf(1, 1, 1, 1, 1),
        ),
        k = 3
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(0, 2),
      actual = solution.kWeakestRows(
        mat = arrayOf(
          intArrayOf(1, 0, 0, 0),
          intArrayOf(1, 1, 1, 1),
          intArrayOf(1, 0, 0, 0),
          intArrayOf(1, 0, 0, 0),
        ),
        k = 2
      )
    )
  }
}
