package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ErectTheFenceTest {
  private val solution = ErectTheFence()

  @Test
  fun example1() {
    val expected = arrayOf(
      intArrayOf(1, 1),
      intArrayOf(2, 0),
      intArrayOf(3, 3),
      intArrayOf(2, 4),
      intArrayOf(4, 2),
    )
    val actual = solution.outerTrees(
      trees = arrayOf(
        intArrayOf(1, 1),
        intArrayOf(2, 2),
        intArrayOf(2, 0),
        intArrayOf(3, 3),
        intArrayOf(2, 4),
        intArrayOf(4, 2),
      )
    )

    assertEquals(expected.size, actual.size)
    expected.forEach {tree ->
      assertTrue {
        actual.any { it.contentEquals(tree) }
      }
    }
  }

  @Test
  fun example2() {
    val expected = arrayOf(
      intArrayOf(1, 2),
      intArrayOf(2, 2),
      intArrayOf(4, 3),
    )
    val actual = solution.outerTrees(
      trees = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(2, 2),
        intArrayOf(4, 3),
      )
    )

    assertEquals(expected.size, actual.size)
    expected.forEach {tree ->
      assertTrue {
        actual.any { it.contentEquals(tree) }
      }
    }
  }
}
