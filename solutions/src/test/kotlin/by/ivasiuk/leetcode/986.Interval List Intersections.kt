package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class IntervalListIntersectionsTest {
  private val solution = IntervalListIntersections()

  @Test
  fun example1() {
    val list1 = arrayOf(
      intArrayOf(0, 2),
      intArrayOf(5, 10),
      intArrayOf(13, 23),
      intArrayOf(24, 25),
    )
    val list2 = arrayOf(
      intArrayOf(1, 5),
      intArrayOf(8, 12),
      intArrayOf(15, 24),
      intArrayOf(25, 26),
    )
    val result = solution.intervalIntersection(list1, list2)
    val expected = arrayOf(
      intArrayOf(1, 2),
      intArrayOf(5, 5),
      intArrayOf(8, 10),
      intArrayOf(15, 23),
      intArrayOf(24, 24),
      intArrayOf(25, 25),
    )

    assertEquals(expected.size, result.size)
    for (i in expected.indices) {
      assertContentEquals(expected[i], result[i])
    }
  }

  @Test
  fun example2() {
    val list1 = arrayOf(intArrayOf(1, 3))
    val list2 = arrayOf(intArrayOf(5, 9))
    val result = solution.intervalIntersection(list1, list2)

    assertTrue(result.isEmpty())
  }
}