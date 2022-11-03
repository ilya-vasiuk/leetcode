package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class InsertIntervalTest {
  private val solution = InsertInterval()

  @Test
  fun example1() {
    val expected = arrayOf(
      intArrayOf(1, 5),
      intArrayOf(6, 9),
    )
    val actual = solution.insert(
      intervals = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(6, 9),
      ),
      newInterval = intArrayOf(2, 5)
    )

    assertEquals(expected.size, actual.size)
    for (i in expected.indices) {
      assertContentEquals(expected[i], actual[i])
    }
  }

  @Test
  fun example2() {
    val expected = arrayOf(
      intArrayOf(1, 2),
      intArrayOf(3, 10),
      intArrayOf(12, 16),
    )
    val actual = solution.insert(
      intervals = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 5),
        intArrayOf(6, 7),
        intArrayOf(8, 10),
        intArrayOf(12, 16),
      ),
      newInterval = intArrayOf(4, 8)
    )

    assertEquals(expected.size, actual.size)
    for (i in expected.indices) {
      assertContentEquals(expected[i], actual[i])
    }
  }
}