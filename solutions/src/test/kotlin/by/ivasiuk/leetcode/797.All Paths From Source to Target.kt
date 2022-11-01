package by.ivasiuk.leetcode

import kotlin.test.*

class AllPathsFromSourceToTargetTest {
  private val solution = AllPathsFromSourceToTarget()

  @Test
  fun example1() {
    val expected = listOf(
      listOf(0, 1, 3),
      listOf(0, 2, 3),
    )
    val actual = solution.allPathsSourceTarget(
      graph = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3),
        intArrayOf(3),
        intArrayOf(),
      )
    )

    assertEquals(expected.size, actual.size)
    actual.forEach {
      assertContains(expected, it)
    }
  }

  @Test
  fun example2() {
    val expected = listOf(
      listOf(0, 4),
      listOf(0, 3, 4),
      listOf(0, 1, 3, 4),
      listOf(0, 1, 2, 3, 4),
      listOf(0, 1, 4),
    )
    val actual = solution.allPathsSourceTarget(
      graph = arrayOf(
        intArrayOf(4, 3, 1),
        intArrayOf(3, 2, 4),
        intArrayOf(3),
        intArrayOf(4),
        intArrayOf(),
      )
    )

    assertEquals(expected.size, actual.size)
    actual.forEach {
      assertContains(expected, it)
    }
  }
}