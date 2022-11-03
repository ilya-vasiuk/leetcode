package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class MergeIntervalsTest {
  private val solution = MergeIntervals()

  @Test
  fun example1() {
    val expected = arrayOf(
      intArrayOf(1, 6),
      intArrayOf(8, 10),
      intArrayOf(15, 18),
    )
    val actual = solution.merge(
      intervals = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(2, 6),
        intArrayOf(8, 10),
        intArrayOf(15, 18),
      )
    )

    assertEquals(expected.size, actual.size)
    for (i in expected.indices) {
      assertContentEquals(expected[i], actual[i])
    }
  }

  @Test
  fun example2() {
    val expected = arrayOf(
      intArrayOf(1, 5),
    )
    val actual = solution.merge(
      intervals = arrayOf(
        intArrayOf(1, 4),
        intArrayOf(4, 5),
      )
    )

    assertEquals(expected.size, actual.size)
    for (i in expected.indices) {
      assertContentEquals(expected[i], actual[i])
    }
  }
}
