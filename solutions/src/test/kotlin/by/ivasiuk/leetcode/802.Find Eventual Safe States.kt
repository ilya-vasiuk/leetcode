package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class FindEventualSafeStatesTest {
  private val solution = FindEventualSafeStates()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(2, 4, 5, 6),
      actual = solution.eventualSafeNodes(
        graph = arrayOf(
          intArrayOf(1, 2),
          intArrayOf(2, 3),
          intArrayOf(5),
          intArrayOf(0),
          intArrayOf(5),
          intArrayOf(),
          intArrayOf(),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(4),
      actual = solution.eventualSafeNodes(
        graph = arrayOf(
          intArrayOf(1, 2, 3, 4),
          intArrayOf(1, 2),
          intArrayOf(3, 4),
          intArrayOf(0, 4),
          intArrayOf(),
        )
      )
    )
  }
}
