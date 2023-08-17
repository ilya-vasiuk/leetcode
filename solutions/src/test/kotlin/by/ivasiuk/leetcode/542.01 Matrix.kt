package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class Matrix01Test {
  private val solution = Matrix01()

  @Test
  fun example1() {
    val expected = arrayOf(
      intArrayOf(0, 0, 0),
      intArrayOf(0, 1, 0),
      intArrayOf(0, 0, 0),
    )

    val actual = solution.updateMatrix(
      mat = arrayOf(
        intArrayOf(0, 0, 0),
        intArrayOf(0, 1, 0),
        intArrayOf(0, 0, 0),
      )
    )

    for (i in expected.indices) {
      assertContentEquals(
        expected = expected[i],
        actual = actual[i]
      )
    }
  }

  @Test
  fun example2() {
    val expected = arrayOf(
      intArrayOf(0, 0, 0),
      intArrayOf(0, 1, 0),
      intArrayOf(1, 2, 1),
    )

    val actual = solution.updateMatrix(
      mat = arrayOf(
        intArrayOf(0, 0, 0),
        intArrayOf(0, 1, 0),
        intArrayOf(1, 1, 1),
      )
    )

    for (i in expected.indices) {
      assertContentEquals(
        expected = expected[i],
        actual = actual[i]
      )
    }
  }
}
